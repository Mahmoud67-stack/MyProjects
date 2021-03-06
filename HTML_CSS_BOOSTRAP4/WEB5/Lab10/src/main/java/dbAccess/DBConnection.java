package dbAccess;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author hend
 */
public class DBConnection {

	//change SCHEMA with your own schema name in the database
	String DBURL = "jdbc:mysql://localhost:3306/lab_9_schema";  

	//change to your password
	String DBUSER = "root";
	String DBPASS = "Yazan5555";
	
	Connection con;
	Statement statement;
	PreparedStatement prepStatement;
	ResultSet rs;

	public DBConnection() {
		try {
			// Load Oracle JDBC Driver
			Class.forName("com.mysql.cj.jdbc.Driver");  

			// Connect to Oracle Database
			con = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
			System.out.println("Connected to the database");

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
			System.out.println("error in DBConnection.");

		}

	}

	public ResultSet executeStatement(String strSQL) throws SQLException {
		// make the result set scrolable forward/backward updatable
		statement = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		// retrieve username and password from database
		rs = statement.executeQuery(strSQL);
		
		return rs;
	}

	public ResultSet retrieveUserDetails() throws SQLException {
		statement = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		// retrieve username and password from database
		String query = "SELECT username FROM lab_9_table ORDER BY username ";
		rs = statement.executeQuery(query);
		return rs;
		
	}

	public int executePrepared(String strSQL) throws SQLException {
		prepStatement = con.prepareStatement(strSQL);
		return prepStatement.executeUpdate();
	}

}
