package com.example.SpringHomeWork;

public interface CRUD {
    Student create(Student t);
    Student readById(int id);
    void readAll();
    void update(Student t);
    void delete(int id);
}
