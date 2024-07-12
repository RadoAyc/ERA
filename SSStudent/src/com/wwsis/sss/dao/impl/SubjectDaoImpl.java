package com.wwsis.sss.dao.impl;

import com.wwsis.sss.dao.SubjectDao;
import com.wwsis.sss.entity.Subject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class SubjectDaoImpl implements SubjectDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addSubject(Subject subject) {
        entityManager.persist(subject);
    }

    @Override
    public void updateSubject(Subject subject) {
        entityManager.merge(subject);
    }

    @Override
    public void deleteSubject(int subjectId) {
        Subject subject = entityManager.find(Subject.class, subjectId);
        if (subject != null) {
            entityManager.remove(subject);
        }
    }

    @Override
    public Subject getSubjectById(int subjectId) {
        return entityManager.find(Subject.class, subjectId);
    }

    @Override
    public List<Subject> getAllSubjects() {
        return entityManager.createQuery("SELECT s FROM Subject s", Subject.class).getResultList();
    }
}

