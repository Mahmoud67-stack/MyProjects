package accountManagement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import dbAccess.DataHandler;


public class Account {

	DataHandler data = new DataHandler();
	boolean validLogin = false;
	ResultSet rs;


	/** The validateUser method checks if the information entered 
	 matches the data stored in the database **/

	public boolean validateUser(String user,String pwd){  

		try {
			// accounts is the list of all the records saved in the users table in the database
			ArrayList<String>  accounts = data.getAccounts();
			int listSize = accounts.size(); 
			
			// loop over the list of user accounts details searching for a match
			for(int i = 0; i < listSize; i++) {
				//check if they match
				if (user.equals(accounts.get(i)) && pwd.equals(accounts.get(i+1))) {
					// Valid Login User found
					return true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// no match found - invalid login
		return false;
	}
}
