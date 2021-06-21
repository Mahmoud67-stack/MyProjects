package dbAccess;

import accountManagement.Account;

public class Main {
	
	
	public static void main(String[] args) {

		//create an instance of the model
		Account model = new Account();

		
		//Exercise 2:
			//Enter username and password saved in the database to show successful login
			//Enter username and password not saved in the database to show unsuccessful login
			//Print successful/unsuccessful messages to the console to show that

		//change user and password values accordingly
		
		//Exercise 3: add a new user and print a successful registration message to the console
		// you will need to create appropriate methods in the relevant classes and call them here
		
	
		/**model.insert("Mahmoud", "mahmoudpwd", "Mahmoud AK", 1, "b00078150@aus.edu", "00078150", "0506775591");
		model.insert("Salem", "salempwd", "Salem SB", 1, "b000784020@aus.edu", "00078402", "0508665443");
		model.insert("Ezz", "ezzpwd", "Ezz DA", 1, "b00073900@aus.edu", "00073900", "0509554331");**/
		
		String user = "Mahmoud";
		String password = "mahmoudpwd";		
		
		//validating if user details matches those saved in the database
		if(model.validateUser(user, password) ) {
			System.out.println("Successful login.");
	
		} else {
			
			System.out.println("Invalid login details. Please try again.");
		}
	}
}

