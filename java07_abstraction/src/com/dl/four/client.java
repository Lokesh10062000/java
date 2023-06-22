package com.dl.four;

/*In Abstract Class we can declare multiple abstract methods, but we can also provide only single method 
implementation of sub class and all other remaining implementations we can take in another class by using 
multilevel inheritance*/

abstract class parent{
	public abstract void m1();
	public abstract void m2();
	public abstract void m3();
	public abstract void m4();
		
}
abstract class child extends parent{

	@Override
	public void m1() {
		System.out.println("default m1");
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("default m2");
	}

	
	
}
 class child2 extends child{

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("default m3");
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		System.out.println("default m4");
	}
	
}
public class client {
	public static void main(String[] args) {
		child2 ch=new child2();
		ch.m1();
		ch.m2();
		ch.m3();
	}

}
