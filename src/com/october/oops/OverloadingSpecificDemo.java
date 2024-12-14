package com.october.oops;

public class OverloadingSpecificDemo {

	public void m1(StringBuffer sb) {
		System.out.println("StringBuffer sb");
	}

	public void m1(String s) {
		System.out.println("String version");
	}

	public static void main(String[] args) {

		OverloadingSpecificDemo osd = new OverloadingSpecificDemo();

		osd.m1(new StringBuffer("Durga"));

		osd.m1("Durga");

		//osd.m1(null); //The method m1(StringBuffer) is ambiguous for the type OverloadingSpecificDemo

	}
}
