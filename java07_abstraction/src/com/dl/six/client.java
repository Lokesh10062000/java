package com.dl.six;

/*We can declare private variables and private methods in Abstract class, but only static variable and method are 
implemented*/


public abstract class client {
	
	private int a=10;
	private void add() {
		System.out.println("private method");
	}

	private static int x=11;
	public static void updte() {
		System.out.println("public method");
	}
	
	public static void main(String[] args) {
		
		//c.a;//private variables are not implemented
		System.out.println(x);
		client.updte();
	}
}
