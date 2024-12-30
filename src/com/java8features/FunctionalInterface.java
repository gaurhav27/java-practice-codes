package com.java8features;

@java.lang.FunctionalInterface
public interface FunctionalInterface {

	public void sayHello();
	//public void sayHi();

	default void sayBye() {
	};

	public static void sayOkay() {
	};

}
