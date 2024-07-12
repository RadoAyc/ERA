package com.wwsis.sss.dao;

import com.wwsis.sss.entity.Subject;
import java.util.List;

public interface SubjectDao {
    void addSubject(Subject subject);
    void updateSubject(Subject subject);
    void deleteSubject(int subjectId);
    Subject getSubjectById(int subjectId);
    List<Subject> getAllSubjects();
}

