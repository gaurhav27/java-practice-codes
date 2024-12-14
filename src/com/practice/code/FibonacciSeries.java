package com.practice.code;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Prompt user for number of terms
		System.out.println("Enter the number of terms in the Fibonacci Series: ");
		int terms = scanner.nextInt();

		// Validate input
		if (terms <= 0) {
			System.out.println("Incorrect Input...please enter a positive number!");
			return;
		}

		// Initialise the first two terms
		int first=0, second=1;

		System.out.println("Fibonacci Series : ");

		for (int i=1; i<=terms; i++) {
			System.out.print(first + " ");

			// Calculate the next term
			int next = first + second;
			first = second;
			second = next;
		}

		scanner.close();
	}
}
