package com.sapient.aem.service;

import java.sql.SQLException;
import java.util.List;

import com.sapient.aem.dao.TeacherDAO;
import com.sapient.aem.dao.TeacherDAOImpl;
import com.sapient.aem.exception.PersonException;
import com.sapient.aem.model.Person;
import com.sapient.aem.model.Teacher;

public class TeacherServiceImpl implements TeacherService {
    private TeacherDAO teacherDAO =new TeacherDAOImpl();
	@Override
	public Teacher getTeacherById(Integer teacher_Id) throws PersonException {
		try {
			Teacher teacher= teacherDAO.getTeacherById(teacher_Id);

			return teacher; 
		}catch(SQLException e) {

			throw new PersonException(e.getMessage(),e);
		}
	}

	@Override
	public List<Teacher> getTeacher() throws PersonException {
		try {
			List<Teacher> teacherList= teacherDAO.getTeacher();

			return teacherList; 
		}catch(SQLException e) {

			throw new PersonException(e.getMessage(),e);
		}
	}

	@Override
	public Integer addTeacher(Teacher teacher) throws PersonException {
		try {
			Integer teacher_Id = teacherDAO.addTeacher(teacher);

			return teacher_Id; 
		}catch(SQLException e) {
			
			throw new PersonException(e.getMessage(),e);
		}
	}
	@Override
	public String updateTeacher(Teacher teacher) throws PersonException {
		try {
			String result= teacherDAO.updateTeacher(teacher);
			return result; 
		}catch(SQLException e) {

			throw new PersonException(e.getMessage(),e);
		}
	}
	@Override
	public String deleteTeacher(Integer teacher_Id) throws PersonException {
		
		try {
			String result=teacherDAO.deleteTeacher(teacher_Id);			
			return result; 
		}catch(SQLException e) {
			
			throw new PersonException(e.getMessage(),e);
		}
	}
}
