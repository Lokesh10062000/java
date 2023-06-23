package com.dl.one;

public class Addition {
	
	//here we pass current class as an argument. when we call the method we need add parameter as "this".
	
	public void add(Addition addition) {
		System.out.println("add method");
		
	}
	public void update() {
		//Here this key word refer to the current class 
		this.add(this);
		System.out.println("update method");
	}
	
	public static void main(String[] args) {
		Addition add = new Addition();
		add.update();
	}

}
