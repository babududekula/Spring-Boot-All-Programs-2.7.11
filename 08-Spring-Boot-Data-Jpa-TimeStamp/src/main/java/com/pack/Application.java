package com.pack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.pack.dao.CarDao;
import com.pack.entity.Car;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		CarDao bean = context.getBean(CarDao.class);
		
		Car c = new Car();
		c.setId(1);
		c.setName("Range Rover");
		
		Car car = bean.save(c);
		System.out.println(car);
	}

}
