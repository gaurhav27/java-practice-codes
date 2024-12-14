package com.practice.code;

import java.util.Scanner;

public class IntegerToBinary {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter an Integer to be converted to Binary: ");
		int inputInteger = scanner.nextInt();

		String binaryRepresentation = Integer.toBinaryString(inputInteger);

		System.out.print("Binary representation of " + inputInteger + " is : " + binaryRepresentation);

		scanner.close();
	}
}
