package com.dl.one;

/*Abstraction:
	1. A Class which is declared with the Abstract keyword is known as an Abstract class.
	2. It can have abstract and non-abstract Methods. (method with the body).
	3. Inside Abstract Class we can take Static and Instance Blocks, but Static Block is executed in Abstract Class, 
	but Instance Block is not executed because we can't create instance in Abstract Class.
	4. Inside Abstract Class we can take Constructor, but you Cannot Instantiate it.
	5. In Abstract Class we don’t have any body, Just we have only Method Signature.
	6. In Abstract Class can declare Instance Methods but instance Creation is not possible, but static methods 
	are possible and callable in Abstract Class 
	7. By default abstract methods are public abstract 
	8. In Abstract class we can have instance variables, static variables and local variables, but static variables 
	and local variables are executed in abstract class but not instance variable*/

public abstract class parent {
	
	//Inside abstract class we can have abstract methods and non abstract methods
	
	//The abstract methods should be overrides defaultly in child class.

	//abstract method it contains child class
	public abstract void m1();
	
	//non-static method
	public void m2() {
		System.out.println("non- abstact method");
	}
}
