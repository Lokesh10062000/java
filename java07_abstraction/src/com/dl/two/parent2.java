package com.dl.two;

/*In Abstract class we can have instance variables, static variables and local variables, but static variables and local 
variables are executed in abstract class but not instance variables*/

public abstract class parent2 {

	static int i =3;
	static int j =5;
	
	int y=23;
	int z=21;
	
	public void m1() {
		int a=100;
		int b=200;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(i);
		System.out.println(j);
		
		
	}
	
}
