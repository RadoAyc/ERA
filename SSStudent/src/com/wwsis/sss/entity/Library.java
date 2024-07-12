package com.wwsis.sss.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Library {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String bookTitle;
    private Date borrowDate;
    private Date dueDate;
    private boolean isOverdue;

    @ManyToOne
    private Student student;

    // Default constructor
    public Library() {}

    // Parameterized constructor
    public Library(String bookTitle, Date borrowDate, Date dueDate, boolean isOverdue, Student student) {
        this.bookTitle = bookTitle;
        this.borrowDate = borrowDate;
        this.dueDate = dueDate;
        this.isOverdue = isOverdue;
        this.student = student;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public Date getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(Date borrowDate) {
        this.borrowDate = borrowDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isOverdue() {
        return isOverdue;
    }

    public void setOverdue(boolean overdue) {
        isOverdue = overdue;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Library [id=" + id + ", bookTitle=" + bookTitle + ", borrowDate=" + borrowDate + ", dueDate=" + dueDate 
               + ", isOverdue=" + isOverdue + ", student=" + student + "]";
    }
}
