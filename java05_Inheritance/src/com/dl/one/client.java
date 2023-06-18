package com.dl.one;

//multilevel inheritance
class Grantparent{
	
	public void m1() { 
		System.out.println("Grand parent method");
	}
}

class parent extends Grantparent{
	
	public void m2() {
		System.out.println("parent method");
	}
}

class chaild extends parent{
	
	public void m3() {
		System.out.println("chaild method");
	}
}

public class client {

	public static void main(String[] args) {
		chaild ch =new chaild();
		ch.m1();
		ch.m2();
		ch.m3();
	}
}
