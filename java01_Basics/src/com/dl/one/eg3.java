package com.dl.one;

	//variables :-variables are the names given to the memory 

	/*syntax:-datatype variable name =value/data;
	
		int a=50;
		double d=5.6;
		String s="dygital lync";
		boolean b=false;
		char c='d';*/

public class eg3 {
	
	
	//Instance or non-static variables
	byte b;
	short s;
	int i;
	long l;
	
	boolean bb;
	
	double d;
	float f;
	char c;
	
	public static void main(String[]args) {
		
		//creating object for the non static variables
	//  classname reff = new classname()	
		eg3 eg3=new eg3();
		
		System.out.println(eg3.b);
		System.out.println(eg3.s);
		System.out.println(eg3.i);
		System.out.println(eg3.l);
		System.out.println(eg3.bb);
		System.out.println(eg3.d);
		System.out.println(eg3.f);
		System.out.println(eg3.c);
	}
}

