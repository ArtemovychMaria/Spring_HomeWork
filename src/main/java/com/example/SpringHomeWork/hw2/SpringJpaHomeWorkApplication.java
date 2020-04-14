package com.example.SpringHomeWork.hw2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringJpaHomeWorkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringJpaHomeWorkApplication.class,
				args);

		UniversityService universityService= (UniversityService) applicationContext.getBean("universityService");

		universityService.create(new University("NULP",28,3020));
		universityService.create(new University("LNU",29,3140));
		universityService.create(new University("UKMA",37,3000));

		System.out.println(universityService.readById(2).get());
		universityService.readAll().forEach(x-> System.out.println(x));

		universityService.update("LP",1);

		universityService.deleteById(2);

		universityService.readAll().forEach(x-> System.out.println(x));
	}



}
