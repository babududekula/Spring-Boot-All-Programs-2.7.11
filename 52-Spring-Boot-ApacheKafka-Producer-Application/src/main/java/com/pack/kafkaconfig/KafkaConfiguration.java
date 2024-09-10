package com.pack.kafkaconfig;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

import com.pack.constants.ProducerConstants;
import com.pack.employee.Employee;

@Configuration
public class KafkaConfiguration 
{
	@Bean
	public ProducerFactory<String, Employee> procedureFactory()
	{
		Map<String, Object> map = new HashMap<>();
		map.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, ProducerConstants.HOST);
		map.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		map.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG , JsonSerializer.class);
		
		return new DefaultKafkaProducerFactory<String, Employee>(map);
		
	}
	
	@Bean(name = "kafkaTemplate")
	public KafkaTemplate<String, Employee> kafkaTemplate(ProducerFactory<String, Employee> producerFactory)
	{
		return new KafkaTemplate<>(producerFactory);
	}
}
