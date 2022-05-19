package com.sapient.aem.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.sapient.aem.model.Person;
import com.sapient.aem.util.Connections;

public class PersonDAOImpl implements PersonDAO  {

	public Person getPersonByAadharCard(Integer aadhar_card) throws SQLException {
		String sql="select * from person where adhar_card= ?";
		Connection connection=null;
		try  {

			connection=Connections.jdbcConnection();
			PreparedStatement preparedStatement= connection.prepareStatement(sql);

			preparedStatement.setInt(1, aadhar_card);
			ResultSet resultSet= preparedStatement.executeQuery();

			if(resultSet.next()) {
				Person person=new Person();

				populatePerson(resultSet,person);
				return person;				
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

	private void populatePerson(ResultSet resultSet, Person person)throws SQLException {
		person.setAdharCard(resultSet.getLong("adharCard"));
		person.setName(resultSet.getString("name"));
		person.setBirthdate(resultSet.getDate("birthdate").toLocalDate());
		person.setAddress(resultSet.getString("address"));
		person.setEmail(resultSet.getString("email"));
		person.setMobile(resultSet.getLong("mobile"));

	}

	public List<Person> getPerson() throws SQLException {
		String sql= "select * from person";
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

			List<Person> personList=new ArrayList<Person>();			
			while(resultSet.next()) {
				Person person= new Person();
				populatePerson(resultSet,person);
				personList.add(person);				
			}

			return personList;

		}catch(SQLException e) {
			throw e;
		}catch(Exception e) {
			throw new SQLException(e.getMessage());
		}finally {
			connection.close();
		}
	}



	public Long addPerson(Person person) throws SQLException {
		String sql= "insert into person(adhar_card,name,birthdate,address,email_id,mobile_number) values(?,?,?,?,?,?)";
		Connection connection=null;
		try{
			connection=Connections.jdbcConnection();
			PreparedStatement preparedStatement= connection.prepareStatement(sql);

			preparedStatement.setLong(1,person.getAdharCard());
			preparedStatement.setString(2, person.getName());

			preparedStatement.setDate(3, java.sql.Date.valueOf(person.getBirthdate()));
			preparedStatement.setString(4, person.getAddress());

			preparedStatement.setString(5, person.getEmail());
			preparedStatement.setLong(6, person.getMobile());

			int n= preparedStatement.executeUpdate();
			if(n>0) {
			return person.getAdharCard();
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
	private Long getaadharId() throws SQLException {
		String sql="select max(adharCrad) from person";
		Connection connection=null;
		try {
			connection=Connections.jdbcConnection();
			Statement statement= connection.createStatement();
			ResultSet resultSet=statement.executeQuery(sql);

			if(resultSet.next()) {
				return resultSet.getLong(1);
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


	public String updatePerson(Person person) throws SQLException {

		String sql="update person set birthdate=?,address=?,email_id=?,mobile_number=? where adhar_card=?";
		Connection connection=null;
		try {
			connection=Connections.jdbcConnection();
			PreparedStatement preparedStatement= connection.prepareStatement(sql);


			preparedStatement.setString(1, person.getBirthdate().toString());
			preparedStatement.setString(2, person.getAddress());
			preparedStatement.setString(3,person.getEmail() );
			preparedStatement.setLong(4,person.getMobile() );



			int n = preparedStatement.executeUpdate();
			if(n>0) {
				return "AadharCard: "+ person.getAdharCard()+" updated";
			}else {
				return "Unable to updateAadharCard: "+person.getAdharCard();
			}

		}catch(SQLException e) {
			throw e;
		}catch(Exception e) {
			throw new SQLException(e.getMessage());
		}finally {
			connection.close();
		}
	}

	public String deletePerson(Long adhar_card) throws SQLException {
		String sql="delete from person where adhar_card=?";
		Connection connection=null;
		try{
			connection=Connections.jdbcConnection();
			PreparedStatement preparedStatement= connection.prepareStatement(sql);

			preparedStatement.setLong(1, adhar_card);
			int n= preparedStatement.executeUpdate();
			if(n>0) {
				return "AadharCard:"+adhar_card+" deleted from database";
			}else {
				return "Unable to delete AadharCard: "+adhar_card;
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
