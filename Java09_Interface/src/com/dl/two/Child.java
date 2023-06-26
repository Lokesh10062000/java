package com.dl.two;

public class Child implements Parent {

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
		p.m1();
		p.m2();
	}

}
