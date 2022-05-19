package com.sapient.aem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.sapient.aem.model.Teacher;
import com.sapient.aem.util.Connections;

public class TeacherDAOImpl implements TeacherDAO {

	public Teacher getTeacherById(Integer teacher_Id) throws SQLException {
		String sql="select * from teacher where teacher_id= ?";
		Connection connection=null;
		try  {

			connection=Connections.jdbcConnection();
			PreparedStatement preparedStatement= connection.prepareStatement(sql);


			preparedStatement.setInt(1, teacher_Id);
			ResultSet resultSet= preparedStatement.executeQuery();

			if(resultSet.next()) {
				Teacher teacher=new Teacher();

				populateTeacher(resultSet,teacher);
				return teacher;				
			}else {
				return null;
			}

		}catch(SQLException e) {

			throw e;
		}catch(Exception e) {
			throw new SQLException(e.getMessage());
		}finally {
			connection.close();
		}

	}

	private void populateTeacher(ResultSet resultSet, Teacher teacher) throws SQLException {
		//person.setAdharCard(resultSet.getLong("adharCard"));
		//teacher.setTeacherId(resultSet.getInt("teacherId"));
		teacher.setQualification(resultSet.getString("qualification"));
		teacher.setGender(resultSet.getString("gender"));
		teacher.setSalary(resultSet.getDouble("salary"));

		
		
	}

	public List<Teacher> getTeacher() throws SQLException {
		String sql= "select * from teacher";
		Connection connection=null;
		try {

			connection=Connections.jdbcConnection();
			Statement statement= 
					connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
							ResultSet.CONCUR_UPDATABLE);

			ResultSet resultSet= statement.executeQuery(sql);
			int rowcount=0;
			if ( resultSet.last()) {
				rowcount =  resultSet.getRow();
				resultSet.beforeFirst();
			}

			List<Teacher> teacherList=new ArrayList<Teacher>();			
			while(resultSet.next()) {
				Teacher teacher =new Teacher();
				populateTeacher(resultSet,teacher);
				teacherList.add(teacher);				
			}

			return teacherList;

		}catch(SQLException e) {
			throw e;
		}catch(Exception e) {
			throw new SQLException(e.getMessage());
		}finally {
			connection.close();
		}
	}


	public Integer addTeacher(Teacher teacher) throws SQLException {
		String sql= "insert into teacher(qualification,gender,salary,adhar_card,teacher_name) values(?,?,?,?,?)";
		Connection connection=null;
		try{
			connection=Connections.jdbcConnection();
			PreparedStatement preparedStatement= connection.prepareStatement(sql);

			//preparedStatement.setLong(1,teacher.getTeacherId());
			

			preparedStatement.setString(1, teacher.getQualification());

			
			preparedStatement.setString(2, teacher.getGender());

			preparedStatement.setDouble(3, teacher.getSalary());
			preparedStatement.setLong(4, teacher.getAdharCard());
			preparedStatement.setString(5, teacher.getName());

			int n= preparedStatement.executeUpdate();
			if(n>0) {
				return getId();
			}else {
				return null;
			}

		}catch(SQLException e) {
			throw e;
		}catch(Exception e) {
			throw new SQLException(e.getMessage());
		}finally {
			connection.close();
		}

	}

	private Integer getId() throws SQLException {
		String sql="select max(teacher_id) from teacher";
		Connection connection=null;
		try {
			connection=Connections.jdbcConnection();
			Statement statement= connection.createStatement();
			ResultSet resultSet=statement.executeQuery(sql);
			
			if(resultSet.next()) {
				return resultSet.getInt(1);
			}else {
				throw new SQLException("No records in the table");
			}
		}catch(SQLException e) {
			throw e;
		}catch(Exception e) {
			throw new SQLException(e.getMessage());
		}finally {
			connection.close();
		}

	}
	public String updateTeacher(Teacher teacher) throws SQLException {
		String sql="update teacher set qualification=?,gender=?,salary=?,adhar_card=? where teacher_id=?";
		Connection connection=null;
		try {
			connection=Connections.jdbcConnection();
			PreparedStatement preparedStatement= connection.prepareStatement(sql);


			preparedStatement.setString(1, teacher.getQualification());
			preparedStatement.setString(2,teacher.getGender());
			preparedStatement.setDouble(3,teacher.getSalary());
			preparedStatement.setLong(4,teacher.getAdharCard());



			int n = preparedStatement.executeUpdate();
			if(n>0) {
				return "Teacherid: "+ teacher.getTeacherId()+" updated";
			}else {
				return "Unable to update TeacherId: "+ teacher.getTeacherId();
			}

		}catch(SQLException e) {
			throw e;
		}catch(Exception e) {
			throw new SQLException(e.getMessage());
		}finally {
			connection.close();
		}
	}
	public String deleteTeacher(Integer teacher_Id) throws SQLException {
		
		String sql="delete from teacher where teacher_id=?";
		Connection connection=null;
		try{
			connection=Connections.jdbcConnection();
			PreparedStatement preparedStatement= connection.prepareStatement(sql);

			preparedStatement.setInt(1, teacher_Id);
			int n= preparedStatement.executeUpdate();
			if(n>0) {
				return "TeacherId:"+teacher_Id+" deleted from database";
			}else {
				return "Unable to delete TeacherId: "+teacher_Id;
			}

		}catch(SQLException e) {
			throw e;
		}catch(Exception e) {
			throw new SQLException(e.getMessage());
		}finally {
			connection.close();
		}
	}
}
