package com.sapient.aem.service;

import com.sapient.aem.exception.PersonException;
import com.sapient.aem.model.Student;


public interface StudentService {
	public abstract Integer addStudent(Student student)throws PersonException;
	public String getStudentGrade(Integer subject1,Integer subject2,Integer subject3,Integer subject4,Integer subject5,Integer subject6);
}