package com.pack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.pack.service.SchoolService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		SchoolService service = context.getBean(SchoolService.class);
	//	service.inovkeSchoolMethod();
		
	//	service.getSchoolMethodData();
		
		service.getSchoolJsonToObject();
	}

}
