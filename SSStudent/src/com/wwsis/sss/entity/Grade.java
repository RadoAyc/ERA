package com.wwsis.sss.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;

@Entity
public class Grade {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String grade;
    private String dateOfGrade;

    @ManyToOne
    private Student student;

    @ManyToOne
    private Subject subject;

    private String teacher;

    // Default constructor
    public Grade() {}

    // Parameterized constructor
    public Grade(String grade, String dateOfGrade, Student student, Subject subject, String teacher) {
        this.grade = grade;
        this.dateOfGrade = dateOfGrade;
        this.student = student;
        this.subject = subject;
        this.teacher = teacher;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getDateOfGrade() {
        return dateOfGrade;
    }

    public void setDateOfGrade(String dateOfGrade) {
        this.dateOfGrade = dateOfGrade;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Grade [id=" + id + ", grade=" + grade + ", dateOfGrade=" + dateOfGrade + ", student=" + student 
               + ", subject=" + subject + ", teacher=" + teacher + "]";
    }
}

