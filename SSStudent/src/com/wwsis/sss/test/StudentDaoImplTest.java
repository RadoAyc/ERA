package com.wwsis.sss.test;

import com.wwsis.sss.dao.impl.StudentDaoImpl;
import com.wwsis.sss.entity.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import javax.persistence.EntityManager;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class StudentDaoImplTest {

    @Mock
    private EntityManager entityManager;

    @InjectMocks
    private StudentDaoImpl studentDao;

    private Student student;

    @BeforeEach
    void setUp() {
        student = new Student();
        student.setId(1);
        student.setName("John Doe");
    }

    @Test
    void addStudent() {
        studentDao.addStudent(student);
        verify(entityManager, times(1)).persist(student);
    }

    @Test
    void updateStudent() {
        studentDao.updateStudent(student);
        verify(entityManager, times(1)).merge(student);
    }

    @Test
    void deleteStudent() {
        when(entityManager.find(Student.class, student.getId())).thenReturn(student);
        studentDao.deleteStudent(student.getId());
        verify(entityManager, times(1)).remove(student);
    }

    @Test
    void getStudentById() {
        when(entityManager.find(Student.class, student.getId())).thenReturn(student);
        Student found = studentDao.getStudentById(student.getId());
        assertEquals(student, found);
    }

    @Test
    void getAllStudents() {
        List<Student> students = List.of(student);
        when(entityManager.createQuery("SELECT s FROM Student s", Student.class).getResultList()).thenReturn(students);
        List<Student> found = studentDao.getAllStudents();
        assertEquals(students, found);
    }
}

