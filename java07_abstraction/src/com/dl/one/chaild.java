package com.dl.one;

public class chaild extends parent {

	@Override
	public void m1() {
		System.out.println("m1 method implimented");

	}
	
	//polymorphisam 
	public static void main(String[] args) {
		parent parent=new chaild();
		parent.m1();
		parent.m2();
		
	}
}
