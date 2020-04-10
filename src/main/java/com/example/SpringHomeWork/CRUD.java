package com.example.SpringHomeWork;


import java.util.List;

public interface CRUD {
    Student create(Student t);
    Student readById(int id);
    List<Student> readAll();
    void update(Student t);
    void delete(int id);
}
