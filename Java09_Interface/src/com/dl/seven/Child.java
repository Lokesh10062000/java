package com.dl.seven;

public class Child extends Parent implements GrandParent {

	@Override
	public void m1() {
		System.out.println("M1 Method");

	}

	@Override
	public void m2() {
		System.out.println("M2 Method");

	}

	@Override
	void m3() {
		System.out.println("M3 Method");

	}

	@Override
	void m4() {
		System.out.println("M4 Method");

	}
	
	public static void main(String[] args) {
		
		GrandParent gp = new Child();
		Parent p = new Child();
		
	}

}
