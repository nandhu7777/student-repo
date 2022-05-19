package com.sapient.aem.util;

import java.sql.Connection;
import java.sql.SQLException;



import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class Connections{

	public static Connection jdbcConnection() throws NamingException, SQLException {
		Context envContext = (Context) new InitialContext().lookup("java:comp/env");
		DataSource dataSource = (DataSource) envContext.lookup("jdbc/detailsDB");
		Connection connection= dataSource.getConnection();
		return connection;

	}
	

}