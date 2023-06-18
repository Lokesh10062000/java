package com.dl.onee;


//single level inheritance
public class chaild extends parent {

	public int add(int a,int b) {
		return a+b;
	}
	public static void main(String[] args) {
		chaild ch=new chaild();
		ch.add();
		put();
		System.out.println(ch.add(20, 30 ));
	}
}
