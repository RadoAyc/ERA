package com.wwsis.sss.test;

import com.wwsis.sss.dao.impl.SubjectDaoImpl;
import com.wwsis.sss.entity.Subject;
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
class SubjectDaoImplTest {

    @Mock
    private EntityManager entityManager;

    @InjectMocks
    private SubjectDaoImpl subjectDao;

    private Subject subject;

    @BeforeEach
    void setUp() {
        subject = new Subject();
        subject.setId(1);
        subject.setSubjectName("Mathematics");
    }

    @Test
    void addSubject() {
        subjectDao.saveSubject(subject);
        verify(entityManager, times(1)).persist(subject);
    }

    @Test
    void updateSubject() {
        subjectDao.saveSubject(subject);
        verify(entityManager, times(1)).merge(subject);
    }

    @Test
    void deleteSubject() {
        when(entityManager.find(Subject.class, subject.getId())).thenReturn(subject);
        subjectDao.deleteSubject(subject.getId());
        verify(entityManager, times(1)).remove(subject);
    }

    @Test
    void getSubjectById() {
        when(entityManager.find(Subject.class, subject.getId())).thenReturn(subject);
        Subject found = subjectDao.getSubjectById(subject.getId());
        assertEquals(subject, found);
    }

    @Test
    void getAllSubjects() {
        List<Subject> subjects = List.of(subject);
        when(entityManager.createQuery("SELECT s FROM Subject s", Subject.class).getResultList()).thenReturn(subjects);
        List<Subject> found = subjectDao.getAllSubjects();
        assertEquals(subjects, found);
    }
}
