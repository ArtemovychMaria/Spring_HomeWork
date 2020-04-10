package com.example.SpringHomeWork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Iterator;

@SpringBootApplication
public class SpringHomeWorkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringHomeWorkApplication.class, args);

		StudentDao studentDao = (StudentDao) applicationContext.getBean("Dao");

		System.out.println(studentDao.create(new Student(1,"Petro",14)));
		System.out.println(studentDao.create(new Student(2,"Ivan",19)));
		System.out.println(studentDao.create(new Student(3,"Ihor",29)));
		System.out.println(studentDao.create(new Student(4,"Vasyl",19)));
		System.out.println(studentDao.create(new Student(5,"Olena",32)));

		System.out.println(studentDao.readById(2));
		System.out.println(studentDao.readById(4));


		studentDao.update(new Student(4,"Kateryna",20));

		studentDao.delete(3);

        Iterator<Student> iterator = studentDao.readAll().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

}
