package com.october.oops;

public class OverloadingDemo1 {

	public void m1(Object o) {
		System.out.println("Object version");
	}

	public void m1(String s) {
		System.out.println("String version");
	}

	// public void m1(Character c) {
	//	System.out.println("Char Wrapper Class");
	//  }

	public static void main(String[] args) {

		OverloadingDemo1 overloadingDemo1 = new OverloadingDemo1();

		overloadingDemo1.m1(new Object()); //Object version

		overloadingDemo1.m1("Durga"); //String version

		overloadingDemo1.m1(null); //String version

	}
}
