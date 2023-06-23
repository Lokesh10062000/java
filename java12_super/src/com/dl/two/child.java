package com.dl.two;

public class child extends parent {
	
	public void m1() {
		System.out.println("child m1 method");
	}
	
	public void m2() {
		System.out.println("chid m2 method");
	}
	
	public void m3() {
		this.m1();
		this.m2();
		super.m1();
		super.m2();
		System.out.println(super.a);
	}
	
	public static void main(String[] args) {
		child ch= new child();
		ch.m3();
	}

}
