package com.practice.code;

public class NextElementFinder {
	public static void main(String[] args) {
		int[] sequence = {21, 9, 21, 11, 21, 13, 21};
		int nextElement = findNextElement(sequence);
		System.out.println("The next element in the sequence is: " + nextElement);
	}

	public static int findNextElement(int[] sequence) {
		int oddNumber = 9; // Starting point for the odd sequence
		for (int i = 1; i < sequence.length; i += 2) {
			if (sequence[i] != oddNumber) {
				throw new IllegalArgumentException("Sequence does not match the expected pattern.");
			}
			oddNumber += 2; // Progress through odd numbers
		}
		return oddNumber; // The next odd number in the sequence
	}
}
