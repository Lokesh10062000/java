package com.dl.one;

		/*else if :-In this the execution start from if block if the condition is false it will execute 
		          the else if block whether the condition is also false it will execute the else block. 
		          
		      Syntax :-if(condition) {
		    	  //statements
		      }else if(condition) {
		    	  //statements
		      }else if(condition) {
		    	  //statements
		      }else {
		    	  
		      }*/
		          

public class eg3 {

	public static void main(String[] args) {
		
		double usersal =50000.00;
		
		if(usersal==10000.00) {
			System.out.println("salary of user is :"+usersal);
		}else if(usersal==20000.00) {
			System.out.println("salary of user is :"+usersal);
		}else if(usersal==30000.00) {
			System.out.println("salary of user is :"+usersal);
		}else if(usersal==0000.00) {
			System.out.println("salary of user is :"+usersal);
		}else {
			System.out.println("user salary is out of range");
		}

	}

}
