package com.wwsis.sss.service.impl;

import com.wwsis.sss.dao.impl.StudentDaoImpl;
import com.wwsis.sss.entity.Student;
import com.wwsis.sss.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDaoImpl studentDao;

    @Override
    @Transactional
    public void addStudent(Student student) {
        studentDao.addStudent(student);
    }

    @Override
    @Transactional
    public void updateStudent(Student student) {
        studentDao.updateStudent(student);
    }

    @Override
    @Transactional
    public void deleteStudent(int id) {
        studentDao.deleteStudent(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Student getStudentById(int id) {
        return studentDao.getStudentById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }
}
