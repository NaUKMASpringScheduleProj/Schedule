package com.schedule.proj.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.persistence.Table;

@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
@Table(name = "Student")
public class Student {

    @Id
    private int id;

    private String faculty;

    private String speciality;
    private int year;

    public Student(String faculty, String speciality, int year) {
        this.faculty = faculty;
        this.speciality = speciality;
        this.year = year;
    }

    public Student() {

    }
    public void setId(int id) {
        this.id = id;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void setYear(int year) {
        this.year = year;
    }



    public int getId() {
        return id;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getSpeciality() {
        return speciality;
    }

    public int getYear() {
        return year;
    }
}