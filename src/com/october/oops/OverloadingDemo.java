package com.october.oops;

public class OverloadingDemo {

	public void m1() {
		System.out.println("Zero Argument Method");
	}

	public void m1(int i) {
		System.out.println("m1 method with one argument" + i);
	}

	public static void main(String[] args) {

		OverloadingDemo overloadingDemo = new OverloadingDemo();

		overloadingDemo.m1();
		overloadingDemo.m1(100);
	}
}
