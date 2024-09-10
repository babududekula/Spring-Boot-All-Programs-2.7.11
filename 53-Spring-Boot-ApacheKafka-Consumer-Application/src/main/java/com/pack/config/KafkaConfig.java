package com.pack.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;

import com.pack.constants.ConsumerConstants;
import com.pack.employee.Employee;

@Configuration
@EnableKafka
public class KafkaConfig 
{
	@Bean
	public ConsumerFactory<String, Employee> consumerFactory()
	{
		Map<String, Object> map = new HashMap<String , Object>();
		map.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, ConsumerConstants.HOST);
		map.put(ConsumerConfig.GROUP_ID_CONFIG, ConsumerConstants.GROUP_ID);
		map.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		map.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
		
		return new DefaultKafkaConsumerFactory<>(map, new StringDeserializer() , new JsonDeserializer<>(Employee.class));
	}
	
	@Bean()
	public ConcurrentKafkaListenerContainerFactory<String, Employee> factory(ConsumerFactory<String, Employee> consumerFactory)
	{
		ConcurrentKafkaListenerContainerFactory<String, Employee> factory = new ConcurrentKafkaListenerContainerFactory<>();
		factory.setConsumerFactory(consumerFactory);
		return factory;
	}
}
