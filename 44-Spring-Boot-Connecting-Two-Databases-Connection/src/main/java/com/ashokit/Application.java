package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.ashokit.book.repository.BookRepository;
import com.ashokit.rest.DemoRestController;
import com.ashokit.serviceimpl.BookServiceImpl;
import com.ashokit.serviceimpl.UserServiceImpl;
import com.ashokit.user.repository.UserRepository;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.ashokit.book" , "com.ashokit.user"})
@ComponentScan(basePackageClasses = {BookServiceImpl.class, UserServiceImpl.class, DemoRestController.class , BookRepository.class , UserRepository.class})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
