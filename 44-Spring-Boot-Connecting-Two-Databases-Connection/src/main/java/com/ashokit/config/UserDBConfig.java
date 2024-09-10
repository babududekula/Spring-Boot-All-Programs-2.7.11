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

import com.ashokit.user.model.User;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
		basePackages = {"com.ashokit.user.repository"},
		entityManagerFactoryRef = "entityManagerFactory",
		transactionManagerRef = "transactionManager"
		)
public class UserDBConfig 
{
	
	@Bean
	@ConfigurationProperties("spring.db2.datasource")
	public DataSourceProperties dataSourceProperties()
	{
		return new DataSourceProperties();
	}
	@Bean
	@ConfigurationProperties("spring.db2.datasource.configuration")
	public DataSource dataSource() 
	{
		return dataSourceProperties().initializeDataSourceBuilder().type(HikariDataSource.class).build();
	}

	@Bean(name = "entityManagerFactory")
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(EntityManagerFactoryBuilder builder)
	{
		
		return builder
				.dataSource(dataSource())
				.packages(User.class)
				.build();
//		HashMap<String, Object> properties = new HashMap<>();
//		properties.put("hibernate.hbm2ddl.auto", "update");
//		
//		return builder.dataSource(dataSource)
//					  .properties(properties)
//					  .packages("com.ashokit.user.model")
//					  .persistenceUnit("user")
//					  .build();
	}

	@Bean(name = "transactionManager")
	public PlatformTransactionManager transactionManager(final @Qualifier("entityManagerFactory") LocalContainerEntityManagerFactoryBean entityManagerFactory) {
		return new JpaTransactionManager(entityManagerFactory.getObject());
	}
}