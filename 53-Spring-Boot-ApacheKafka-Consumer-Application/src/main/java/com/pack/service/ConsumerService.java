package com.pack.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.pack.constants.ConsumerConstants;
import com.pack.employee.Employee;

@Service
public class ConsumerService 
{
	@KafkaListener(topics = ConsumerConstants.TOPIC, groupId = ConsumerConstants.GROUP_ID)
	public Employee listener(Employee c) {
		System.out.println("***Msg recieved from Kafka Topic ::" + c);
		return c;
	}
}
