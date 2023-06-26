package com.dl.two;

public class client {
	
	public static void main(String[] args) {
		
		//.values() converts the enum values into an array
		
		Books[] values = Books.values();
		
		for(Books books :values) {
			System.out.println(books);
			
			//.ordinal gives the Index number of the word present in an array
			
			System.out.println(books.ordinal());
			
		}
	}

}
/*
 * Difference between Enums and Classes An enum can, just like a class, have
 * attributes and methods. The only difference is that enum constants are
 * public, static and final (unchangeable - cannot be overridden).
 * 
 * An enum cannot be used to create objects, and it cannot extend other classes
 * (but it can implement interfaces).
 */

/*
 * Why And When To Use Enums? Use enums when you have values that you know
 * aren't going to change, like month days, days, colors, deck of cards, etc.
 */