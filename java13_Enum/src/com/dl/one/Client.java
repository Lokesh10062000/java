package com.dl.one;

public class Client {
	
	public static void main(String[] args) {
		System.out.println(Gender.MALE);
		System.out.println(Gender.FEMALE);
		
		Gender valueOf = Gender.valueOf("FEMALE");
		System.out.println(valueOf);
		
	}

}
