package com.patterns;

public class StarPattern {

	public void printPatternRightTriangle(int number) {
		for(int i=1; i<=number; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

	public void printPatternInvertedRightTriangle(int number) {
		for(int i=1; i<=number; i++) {
			for(int j=1; j<=number-i+1; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}


}
