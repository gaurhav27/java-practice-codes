package com.patterns;

public class Patterns {

	public static void main(String[] args) {

		StarPattern sp = new StarPattern();
		sp.printPatternRightTriangle(4);
		System.out.println("");
		sp.printPatternInvertedRightTriangle(5);
		System.out.println("");

		int[] arrayInput = {3,4,5,7,9};

		for(int output:arrayInput) {
			System.out.print(output + " ");
		}
		System.out.println("");
	}
}
