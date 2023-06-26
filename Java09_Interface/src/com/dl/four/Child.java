package com.dl.four;

public class Child implements GrandParent, Parent {

	@Override
	public void m3() {
		System.out.println("M3 Method");

	}

	@Override
	public void m4() {
		System.out.println("M4 Method");

	}

	@Override
	public void m1() {
		System.out.println("M1 Method");

	}

	@Override
	public void m2() {
		System.out.println("M2 Method");

	}

	public static void main(String[] args) {
		
		Parent p = new Child();
		p.m3();
		p.m4();
		
		GrandParent gp = new Child();
		gp.m1();
		gp.m2();
	}
}
