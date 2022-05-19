package com.sapient.aem.service;

import java.sql.SQLException;

import com.sapient.aem.dao.StudentDAO;
import com.sapient.aem.dao.StudentDAOImpl;

import com.sapient.aem.exception.PersonException;
import com.sapient.aem.model.Student;

public class StudentServiceImpl implements StudentService {
	private StudentDAO studentDAO =new StudentDAOImpl();
	@Override
	public Integer addStudent(Student student) throws PersonException {
		try {
			Integer admissionCode = studentDAO.addStudent(student);

			return admissionCode; 
		}catch(SQLException e) {
			
			throw new PersonException(e.getMessage(),e);
		}
	
	}
	@Override
	public String getStudentGrade(Integer subject1,Integer subject2,Integer subject3,Integer subject4,Integer subject5,Integer subject6) {

		String grade;
		int sum=subject1+subject2+subject3+subject4+subject5+subject6;

		if(sum>=480 && sum<=600) {
			grade="A+";

		}else if(sum>=360) {
			grade="A";			
		}else if(sum>=300) {
			grade="B";
		}else {
			grade="No Grade";
		}
		return grade;

	}

}