package com.dl.two;

//Hierarchical inheritance
class Grandparent{
	public void m1() {
		System.out.println("m1 method");
	}
}

class parent extends Grandparent{
	public void m2() {
		System.out.println("m2 method");
	}
}

public class child extends Grandparent{
	public void m3() {
		System.out.println("m3 method");
	}
	
	public static void main(String[] args) {
		parent parent=new parent();
		parent.m1();
		parent.m2();
		
		child ch=new child();
		ch.m1();
		ch.m3();
	}
}
