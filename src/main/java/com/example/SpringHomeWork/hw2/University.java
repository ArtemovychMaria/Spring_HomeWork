package com.example.SpringHomeWork.hw2;

import javax.persistence.*;

@Entity
@Table(name = "universities")
public class University {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    int level;
    @Column(name = "number_of_institutes")
    int numberOfInstitutes;
    @Column(name = "number_of_students")
    int numberOfStudents;
    String adress;

    public University() {
    }

    public University(String name, int numberOfInstitutes, int numberOfStudents) {
        this.name=name;
        this.numberOfInstitutes=numberOfInstitutes;
        this.numberOfStudents=numberOfStudents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getNumberOfInstitutes() {
        return numberOfInstitutes;
    }

    public void setNumberOfInstitutes(int numberOfInstitutes) {
        this.numberOfInstitutes = numberOfInstitutes;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "University{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", level=" + level +
                ", numberOfInstitutes=" + numberOfInstitutes +
                ", numberOfStudents=" + numberOfStudents +
                ", adress='" + adress + '\'' +
                '}';
    }
}
