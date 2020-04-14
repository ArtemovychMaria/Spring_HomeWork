package com.example.SpringHomeWork.hw1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Iterator;

@SpringBootApplication
public class SpringHomeWorkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringHomeWorkApplication.class, args);

		StudentDao studentDao = (StudentDao) applicationContext.getBean("getStudentDao");

		System.out.println(studentDao.create(new Student("Petro",14)));
		System.out.println(studentDao.create(new Student("Ivan",19)));
		System.out.println(studentDao.create(new Student("Ihor",29)));
		System.out.println(studentDao.create(new Student("Vasyl",19)));
		System.out.println(studentDao.create(new Student("Olena",32)));

		System.out.println(studentDao.readById(2));
		System.out.println(studentDao.readById(4));

		Student updateStudent=new Student("Svitlana",25);
		updateStudent.setId(2);
		studentDao.update(updateStudent);

		studentDao.delete(3);
		studentDao.delete(6);

        Iterator<Student> iterator = studentDao.readAll().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

}
