package com.dl.one;

/*"this" key word is used to invoke current class methods */


/*this keyword to refer current class instance variable 
this keyword can be used to refer current class instance variable. 
If there is ambiguity between the instance variables and parameters, this keyword resolves the problem of 
ambiguity.
a) if we use same variables for instance variables and parameters has no effect
b) If we use different variables for instance variables and parameters has effect
c) we can use this keyword if we have same variables for instance variables 
and parameters*/


public class client {
	
	public void add() {
		this.update();
		System.out.println("add method");
	}
	
	public void update() {
		this.delete();
		System.out.println("update method");

	}
	public void delete() {
		System.out.println("delete method");

	}
	
	public static void main (String[]args) {
		client c=new client();
		c.add();
	}

}
