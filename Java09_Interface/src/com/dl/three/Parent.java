package com.dl.three;

public interface Parent {

	//Static Variable
	int a = 10;
	int b = 20;
	
	public static final int c = 30;
	
	public static void main(String[] args) {
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
}
