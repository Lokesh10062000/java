package com.dl.six;

public class Client implements ProfileThree {

	@Override
	public void m1() {

		System.out.println("M1 Method");
	}

	@Override
	public void m2() {
		System.out.println("M2 Method");

	}

	@Override
	public void m3() {
		System.out.println("M3 Method");
	}

	@Override
	public void m4() {
		System.out.println("M4 Method");
	}

	@Override
	public void m5() {
		
		System.out.println("M5 Method");
	}

	@Override
	public void m6() {
		System.out.println("M6 Method");

	}

	public static void main(String[] args) {
		
		ProfileThree t = new Client();
		t.m1();
		t.m2();
		t.m3();
		t.m4();
		t.m5();
		t.m6();
		
	}
}
