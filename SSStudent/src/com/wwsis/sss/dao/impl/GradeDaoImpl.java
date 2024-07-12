package com.wwsis.sss.dao.impl;

import com.wwsis.sss.dao.GradeDao;
import com.wwsis.sss.entity.Grade;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class GradeDaoImpl implements GradeDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addGrade(Grade grade) {
        entityManager.persist(grade);
    }

    @Override
    public void updateGrade(Grade grade) {
        entityManager.merge(grade);
    }

    @Override
    public void deleteGrade(int gradeId) {
        Grade grade = entityManager.find(Grade.class, gradeId);
        if (grade != null) {
            entityManager.remove(grade);
        }
    }

    @Override
    public Grade getGradeById(int gradeId) {
        return entityManager.find(Grade.class, gradeId);
    }

    @Override
    public List<Grade> getAllGrades() {
        return entityManager.createQuery("SELECT g FROM Grade g", Grade.class).getResultList();
    }
}

