package com.pack;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Sort;

import com.pack.dao.EmployeeDao;
import com.pack.entity.Employee;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		EmployeeDao bean = run.getBean(EmployeeDao.class);
		
//		Employee emp = new Employee();
//		emp.setLocation("Hyd");
//		emp.setSalary(2900.90);
//		
//		Example<Employee> example = Example.of(emp);
//		List<Employee> findAll = bean.findAll(example);
//		findAll.forEach(user->{
//			System.out.println(user);
//		});
//		
		
		
//		int startPage = 2;
//		int pageSize = 3;
//		PageRequest pageRequest = PageRequest.of(startPage-1, pageSize);
//		
//		Page<Employee> findAll = bean.findAll(pageRequest);
//		findAll.forEach(user->{
//			System.out.println(user);
//		});
		
//		List<Employee> findAll = bean.findAll(Sort.by("name").ascending());
//		findAll.forEach(user->{
//			System.out.println(user);
//		});
//		
//		List<Employee> findAll2 = bean.findAll(Sort.by("name").descending());
//		findAll2.forEach(user->{
//			System.out.println(user);
//		});
//		
//		List<Employee> findAll3 = bean.findAll(Sort.by("name" ,"location").ascending());
//		findAll3.forEach(user->{
//			System.out.println(user);
//		});
	}

}
