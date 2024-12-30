package com.practice.code;

import java.util.Scanner;

public class ReverseStringWords {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Type a sentence : ");
		String input = scanner.nextLine();

		StringBuilder answer = new StringBuilder();

		String[] inputArray = input.split(" ");


		for (int i=inputArray.length-1; i>=0; i--) {
			answer.append(inputArray[i]);

			if (i != 0) {
				answer.append(" ");
			}
		}
		System.out.print("Reversed String : " + answer);
	}
}
