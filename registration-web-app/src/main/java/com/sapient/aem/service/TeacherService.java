package com.sapient.aem.service;

import java.util.List;

import com.sapient.aem.exception.PersonException;
import com.sapient.aem.model.Teacher;

public interface TeacherService {
	public abstract Teacher getTeacherById(Integer teacher_Id)throws PersonException;
	public abstract List<Teacher>getTeacher()throws PersonException;
	public abstract Integer addTeacher(Teacher teacher)throws PersonException;
	public abstract String updateTeacher(Teacher teacher)throws PersonException;
	public abstract String deleteTeacher(Integer teacher_Id)throws PersonException;
}
