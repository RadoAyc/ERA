package com.wwsis.sss.dao;

import com.wwsis.sss.entity.Student;
import java.util.List;

public interface StudentDao {
    void addStudent(Student student);
    void updateStudent(Student student);
    void deleteStudent(int studentId);
    Student getStudentById(int studentId);
    List<Student> getAllStudents();
}
