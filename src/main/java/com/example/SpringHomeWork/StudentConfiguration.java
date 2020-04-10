package com.example.SpringHomeWork;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfiguration {

    @Bean(name = "Dao")
    public StudentDao getStudentDao(){
        return new StudentDao();
    }
}
