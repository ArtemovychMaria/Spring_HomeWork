package com.example.SpringHomeWork.hw1;

import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentDao implements CRUD {

    List<Student> students=new ArrayList<>();

    @Override
    public Student create(Student t) {
        int listSize=students.size();
        t.setId(listSize+1);
        students.add(t);
        return t;
    }

    @Override
    public Student readById(int id) {
            Student student1=null;
            Iterator<Student> iterator = students.iterator();
            while (iterator.hasNext()) {
                Student student=iterator.next();
                if (id == student.getId()) {
                    student1=student;
                }
            }
            return student1;
        }


    @Override
    public List<Student> readAll() {
        return students;
    }

    @Override
    public void update(Student t) {
        int i=0;
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            if(t.getId()==iterator.next().getId()) {
                students.set(i,t);
            }
            i++;
        }
    }

    @Override
    public void delete(int id) {
        List<Integer>studentIds=new ArrayList<>();
        students.forEach(student -> studentIds.add(student.getId()));
        if(studentIds.contains(id)) {
            Iterator<Student> iterator = students.iterator();
            while (iterator.hasNext()) {
                if (id == iterator.next().getId()) {
                    iterator.remove();
                }
            }
        }else
            System.out.println(String.format("Student with id %d not exist in students data base",id));
    }


    @PreDestroy
    private void cleanUp(){
        System.out.println("I've done it");
    }
}
