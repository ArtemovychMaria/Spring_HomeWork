package com.example.SpringHomeWork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringHomeWorkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringHomeWorkApplication.class, args);

		StudentDao studentDao = (StudentDao) applicationContext.getBean("Dao");

		System.out.println(studentDao.create(new Student(1,"Petro",19)));
		System.out.println(studentDao.create(new Student(2,"Ivan",19)));
		System.out.println(studentDao.create(new Student(3,"Ihor",19)));
		System.out.println(studentDao.create(new Student(4,"Vasyl",19)));
		System.out.println(studentDao.create(new Student(5,"Olena",19)));

		System.out.println(studentDao.readById(2));
		System.out.println(studentDao.readById(4));


		studentDao.update(new Student(4,"Kateryna",20));

		studentDao.delete(3);

		studentDao.readAll();
	}

}
