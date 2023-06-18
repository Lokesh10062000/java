package com.dl.one;


/*  Polymorphisam :-Polymorphism in Java is a concept by which we can perform a single action in different ways.
  				  Polymorphism is derived from 2 Greek words: poly and morphs. The word "poly" means many 
  				  and "morphs" means forms. So polymorphism means many forms.*/

/* 	Types of polymorphisam :-
 	
 		1)Method overloading :-The method name should be same.And Arguments must be different. in only one class
		2)Method overriding  :-The method name should be same.And the arguments are also same, But in different classes.*/


public class methodOverloading {

	//polymorphisam 
	//method overloading
	
	public void gasStation(int pPrice ,int dprice) {
		System.out.println("pprice ="+pPrice);
		System.out.println("pprice ="+dprice);
	}
	public void gasStation(double pPrice ,int dprice) {
		System.out.println("pprice ="+pPrice);
		System.out.println("pprice ="+dprice);
	}
	
	public static void main(String[] args) {
		methodOverloading poly =new methodOverloading();
		poly.gasStation(100, 80);
		poly.gasStation(100.3, 80);
	}
}
