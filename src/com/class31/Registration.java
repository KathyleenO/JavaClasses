package com.class31;

public class Registration {

/*1.	Create Registration Class in which you would have variables as email, 
 * userName and password that have an access scope only within its own class. 
 * After creating an object of the class user should be able to call methods 
 * and in each method separately pass values to set users email, username and password. 
 * 	
 */
	
	private String username;
	private String email;
	private String password;
	
	public String getUsername() {
		return username;
	}
	
	public String getemail() {
		return email;
		
	}
	public String getpassword() {
		return password;
		
	}
	
	//setter
	public void setUsername(String username) {
		if (!username.isEmpty()) {
			if (username.length() > 6) {
				this.username = username;
			} else {
				System.out.println("Username should have more than 6 characters");
			}
		} else {
			System.out.println("Username cannot be empty");
		}
	}
	
	public void setemail(String email) {
		if (email.contains("gmail.com")) {
			this.email = email;
		} else {
			System.out.println("Invalid email type. Email must be gmail");
		}

		
		}
	public void setPassword(String password) {
		if (!password.isEmpty()) {

			if (password.length() > 6) {

				if (!password.contains(username)) {
					this.password =password;
				} else {
					System.out.println("Password cannot contain username");
				}
			} else {
				System.out.println("Password should have more than 6 characters");
			}

		} else {
			System.out.println("Password cannot be empty");
		}
		
		}
	
	
	
	
}
