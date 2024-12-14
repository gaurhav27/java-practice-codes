package com.october.oops;

public class OverloadingDemo4 {

	public void m1(Integer i) {
		System.out.println("Integer Wrapper Version");
	}

	public void m1(int i) {
		System.out.println("int primitive version");
	}

	public static void main(String[] args) {

		OverloadingDemo4 od = new OverloadingDemo4();
		od.m1(10);
	}
}
