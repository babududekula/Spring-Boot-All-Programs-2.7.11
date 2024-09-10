package com.pack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.pack.constants.ProducerConstants;
import com.pack.employee.Employee;

@Service
public class ProducerService 
{
	@Autowired
	private KafkaTemplate<String, Employee> kafkaTemplate;
	
	public String addModuleService(List<Employee> employee)
	{
		if(!employee.isEmpty())
		{
			for(Employee emp : employee)
			{
				kafkaTemplate.send(ProducerConstants.TOPIC, emp);
				System.out.println("**** message has sent to kafka ****");
			}
		}
		return "Successfully Data Added To Kafka";
	}
}
