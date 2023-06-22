package com.dl.one;

/*Encapsulation:
	
	1. Encapsulation is a process of wrapping Data and their methods together into a single unit is called 
	Encapsulation.
	2. We can create a fully Encapsulated Class by making all the Data Members of the class Private.
	3. Now we can use Setter and Getter Methods to set and get the data in it.*/

/*Advantages of Encapsulation:
	
	1. The two major advantages of Encapsulation are Security and Easy Maintainability or easy to enhance 
	our code. 
	2. Since we mark our Fields as Private they are Secured.
	3. That they can be accessed by Getters and Setters Methods.*/

public class Rigister {
	
	private String username;
	private String Email;
	private int rollno;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
}
