package com.dl.one;

public class RegisterImpl extends Rigister {

	public static void main(String[] args) {
		RegisterImpl reimpl =new RegisterImpl();
		reimpl.setUsername("Lokesh");
		reimpl.setRollno(30);
		reimpl.setEmail("lokesh003@gmail.com");
		System.out.println(reimpl.getUsername());
		System.out.println(reimpl.getRollno());
		System.out.println(reimpl.getEmail());
	}

}
