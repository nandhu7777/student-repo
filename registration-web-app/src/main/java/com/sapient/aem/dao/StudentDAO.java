package com.sapient.aem.dao;


import java.sql.SQLException;
import java.util.List;


import com.sapient.aem.model.Student;

//CRUD operations
public interface StudentDAO {

	public abstract Integer addStudent(Student student) throws SQLException;
}