package com.sapient.aem.dao;

import java.sql.SQLException;
import java.util.List;

import com.sapient.aem.model.Teacher;

public interface TeacherDAO {
	public abstract Teacher getTeacherById(Integer teacher_Id)throws SQLException;
	public abstract List<Teacher>getTeacher()throws SQLException;
	public abstract Integer addTeacher(Teacher teacher)throws SQLException;
	public abstract String updateTeacher(Teacher teacher)throws SQLException;
	public abstract String deleteTeacher(Integer teacher_Id)throws SQLException;
}
