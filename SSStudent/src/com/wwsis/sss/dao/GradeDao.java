package com.wwsis.sss.dao;

import com.wwsis.sss.entity.Grade;
import java.util.List;

public interface GradeDao {
    void addGrade(Grade grade);
    void updateGrade(Grade grade);
    void deleteGrade(int gradeId);
    Grade getGradeById(int gradeId);
    List<Grade> getAllGrades();
}

