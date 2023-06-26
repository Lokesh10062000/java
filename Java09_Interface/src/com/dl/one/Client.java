package com.dl.one;

interface Parent{
	
	void m1();
	
	void m2();
	
	public abstract void m3();
	
}

class Child implements Parent{

	@Override
	public void m1() {
		System.out.println("M1 Method");
		
	}

	@Override
	public void m2() {
		System.out.println("M2 Method");
		
	}

	@Override
	public void m3() {
		System.out.println("M2 Method");
		
	}
	
	
}

public class Client {

	public static void main(String[] args) {
		
		Child child = new Child();
		child.m1(); 
		child.m2(); 
		child.m3(); 
		

	}

}
