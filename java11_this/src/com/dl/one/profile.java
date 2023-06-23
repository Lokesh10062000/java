package com.dl.one;

public class profile {
	
	//instance variable
	public String username;
	public String Email;
	public long userno;
	
	
	public profile(String username, String email, long userno) {
		//By using this key word we would use same names as mention in the instance variable
		
		this.username = username;
		
		//without using this key word we need to change the literal name in the parameter and assigning 
		
		Email = email;
		this.userno = userno;
	}
	
	public void display() {
		System.out.println(username);
		System.out.println(Email);
		System.out.println(userno);
		
	}
	
	public static void main(String[] args) {
		profile profile = new profile("lokesh", "lokesh@003", 9515841346l);
		profile.display();
	}
	
	

}
