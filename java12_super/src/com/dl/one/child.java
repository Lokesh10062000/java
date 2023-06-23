package com.dl.one;

public class child extends parent {
	
	int a=100;
	int b=200;
	
	public void operations() {
		System.out.println(this.a);
		System.out.println(this.b);
		
		System.out.println(super.a);
		System.out.println(super.b);
	}
	public static void main(String[] args) {
		child ch = new child();
		ch.operations();
	}

}
