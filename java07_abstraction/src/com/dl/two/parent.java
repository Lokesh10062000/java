package com.dl.two;

/*Inside Abstract Class we can take Static and Instance Blocks, but Static Block is executed in Abstract Class, 
but Instance Block is not executed because we cant create instance in Abstract Class.*/

public abstract class parent {

	static {
		System.out.println("static block");
	}
	{
		System.out.println("non-static block");
	}
	public static void main(String[] args) {
		//parent p=new parent();//cannot instance the type parent
	}
}
