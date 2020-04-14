package com.example.SpringHomeWork.hw1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfiguration {

    @Bean
    public StudentDao getStudentDao(){
        return new StudentDao();
    }
}
