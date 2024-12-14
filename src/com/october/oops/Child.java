package com.october.oops;

public class Child extends Parent {

	public void m2() {
		System.out.println("m2 from child");
	}

	@Override
	public void m1() {
		System.out.println("m1 from child");
	}

	public static void main(String[] args) {

		//case1
		Parent p1 = new Parent();
		p1.m1();

		Child c1 = new Child();

		//case2
		c1.m1();
		c1.m2();

		//case3
		Parent p2 = new Child();
		p2.m1();

		//case4 not applicable
		// Child c2 = new Parent();
	}
}
