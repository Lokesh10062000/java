package com.dl.one;

//"this()" constructor to invoke current class constructor;

public class ProfileCons {
	
	public ProfileCons() {
		this(20);
		System.out.println("default constructor");
	}
	public ProfileCons(int a) {
		this(100,200);
		System.out.println("single parameter constructor");
	}
	
	public ProfileCons(int a, int b) {
		System.out.println("double parameterized constructor");
	}
	
	public static void main(String[]args) {
		ProfileCons profileCons = new ProfileCons();
	}
	

}
