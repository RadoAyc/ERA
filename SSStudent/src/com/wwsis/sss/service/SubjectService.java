
package com.wwsis.sss.service;

import com.wwsis.sss.entity.Student;

public class SubjectService {

	 private final SubjectDao subjectDao;

	    @Autowired
	    public SubjectService(SubjectDao subjectDao) {
	        this.subjectDao = subjectDao;
}
