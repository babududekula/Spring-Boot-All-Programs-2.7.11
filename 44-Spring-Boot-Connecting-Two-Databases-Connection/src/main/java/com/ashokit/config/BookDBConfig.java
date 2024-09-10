package com.ashokit.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.ashokit.book.model.Book;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
		basePackages = {"com.ashokit.book.repository"},
		entityManagerFactoryRef = "bookEntityManagerFactory",
		transactionManagerRef = "bookTransactionManager"
		)
public class BookDBConfig 
{

	//@Primary
	@Bean
	@ConfigurationProperties("spring.db1.datasource")
	public DataSourceProperties dataSourceProperties()
	{
		return new DataSourceProperties();
	}
	
	@Bean
	@ConfigurationProperties("spring.db1.datasource.configuration")
	public DataSource dataSource() 
	{
		return dataSourceProperties().initializeDataSourceBuilder().type(HikariDataSource.class).build();
	}

	//@Primary
	@Bean(name = "bookEntityManagerFactory")
	public LocalContainerEntityManagerFactoryBean bookEntityManagerFactory(EntityManagerFactoryBuilder builder) 
	{ 
		
		return builder
				.dataSource(dataSource())
				.packages(Book.class)
				.build();
//		HashMap<String, Object> properties = new HashMap<>();
//		properties.put("hibernate.hbm2ddl.auto", "update");
//		
//		return builder.dataSource(dataSource)
//					  .properties(properties)
//					  .packages("com.ashokit.book.model.Book")
//					  .persistenceUnit("book")
//					  .build();
	}

	//@Primary
	@Bean(name = "bookTransactionManager")
	public PlatformTransactionManager bookTransactionManager(final @Qualifier("bookEntityManagerFactory") LocalContainerEntityManagerFactoryBean bookEntityManagerFactory) 
	{
		return new JpaTransactionManager(bookEntityManagerFactory.getObject());
	}
}