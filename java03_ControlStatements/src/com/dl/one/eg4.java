package com.dl.one;

		/* Switch case :-It will same like as the else if . 
		     
		      Syntax :-switch(value/key) {
		        case value/key:
		        	//statements
		        default:  
		      }*/

public class eg4 {

	public static void main(String[] args) {
		
		int usersal =10000;
		
		switch(usersal) {
		case 10000:
			System.out.println("usersal is :"+usersal);break;
		case 20000:
			System.out.println("usersal is :"+usersal);break;
		case 30000:
			System.out.println("usersal is :"+usersal);break;
			default:
				System.out.println("use sal is out of range");
		}

	}

}
