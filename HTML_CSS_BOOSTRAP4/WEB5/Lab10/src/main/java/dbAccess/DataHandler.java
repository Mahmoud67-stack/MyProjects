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
		String query = "SELECT username, password FROM lab_9_table ORDER BY username ";

		rs = dbCon.executeStatement(query);
		
		rs.beforeFirst();
		while(rs.next()) { 
			users.add(rs.getString("username"));
			users.add(rs.getString("password"));
		}
		return users;

	}
	
	public void insertuser(String username,String password,String name,int type,String email,String ID,String phone) {
		
		 String query = "INSERT INTO lab_9_table " + "VALUES ('"+username+"', '"+password+"', '"+ name+"', '"+type+"', '"+ email+"', '"+ ID+"', '"+ phone+"') ";
			try {
				int res = dbCon.executePrepared(query);
				System.out.println(res);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

}
