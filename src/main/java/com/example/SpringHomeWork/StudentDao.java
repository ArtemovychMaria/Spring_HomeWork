package com.example.SpringHomeWork;

import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentDao implements CRUD {

    List<Student> students=new ArrayList<>();

    @Override
    public Student create(Student t) {
        students.add(t);
        return t;
    }

    @Override
    public Student readById(int id) {
        Student student = students.get(id-1);
        return student;
    }

    @Override
    public List<Student> readAll() {
        return students;
    }

    @Override
    public void update(Student t) {
       students.set((t.getId()-1),t);
    }

    @Override
    public void delete(int id) {
        students.remove(id-1);
    }

    @PreDestroy
    private void cleanUp(){
        System.out.println("I've done it");
    }
}
