package dbAccess;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DataHandler {
	DBConnection dbCon;
	ResultSet rs;
	
	public DataHandler() {
		//connect to the database
		dbCon = new DBConnection();
	
	}

	public ArrayList<String> getAccounts() throws SQLException {
		// List of usernames and passwords in the database
		ArrayList<String> users = new ArrayList<String>();
		String query = "SELECT username, password FROM users ORDER BY username ";

		rs = dbCon.executeStatement(query);
		
		rs.beforeFirst();
		while(rs.next()) { 
			users.add(rs.getString("username"));
			users.add(rs.getString("password"));
		}
		return users;

	}

}
