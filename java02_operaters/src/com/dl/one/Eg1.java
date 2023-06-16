package com.dl.one;

	/*Operater :-operaters are the symbol which are used to perform task or operation
	      Ex :- +,*,%,/*/
	
	/*Operands :- The value or data which is used to perform operater operation is known as operands.
	          Ex :-10+20;//10 and 20 are operands
	*/

	/*	Types of operaters 
		  1)unary operater :- the operater which can accept only one operand is known as unary operater
		  2)Binary operater :-The operater which can accept only two operands ia known as binary operater.
		  3)Ternary operater :-The operater which can accept minimum three operands and more than three is known as ternary operater
	
	*/
public class Eg1 {
 public static void main(String[] args) {
	//unary operaters
	 int a=20;
	 int b=21;
	 System.out.println(a++);//20
	 System.out.println(b++);//21
	 
	 System.out.println(++a);//22
	 System.out.println(++b);//23
	 
	 
	 //Binary operater
	 System.out.println(a+b);
}
}
