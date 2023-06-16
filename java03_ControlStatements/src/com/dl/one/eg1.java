package com.dl.one;

/*
		Types of control statements
			1)Selection Statements
				a)if
				b)else if
				c)switch
			2)Iteration Statements
				a)while
				b)do while
				c)for*/


/* if -->whether the condition is true,that only it will execute the statements inside the if block.
 		Syntax :-if(condition) {
 			
 		}*/
    
public class eg1 {

	public static void main(String[] args) {
		
		if(true) {
			System.out.println("condition of if block");
		}
		
		if(true) {
			System.out.println("condition of if block 01");
		}else {
			System.out.println("condition of else block");
		}
		
		if(false) {
			System.out.println("condition of if block 02");
		}else {
			System.out.println("condition of else block 02");
		}

	}

}
