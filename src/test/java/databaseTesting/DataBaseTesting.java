package databaseTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseTesting {
	
	public static void main(String[] args) throws SQLException {
		//create connection
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306", "root","");
		boolean closed = connection.isClosed();
		
		if(closed) {
			System.out.println("database is not connected");
			
		}
		else {
			System.out.println("database is successfully connected");
			
		}
		//create  statement
		Statement createStatement = connection.createStatement();
		 createStatement.executeQuery("create database loginform;");
		
		
	}

}
