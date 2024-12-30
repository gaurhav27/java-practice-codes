package com.practice.code;

public class PrimeNumbers {

		//Prime Numbers

		public static void main(String[] args) {
			System.out.println("Prime numbers between 1 and 20 are:");
			for (int i = 1; i <= 20; i++) {
				if (isPrime(i)) {
					System.out.print(i + " ");
					System.out.println("Prime Numbers!!");
				}
			}
		}

		public static boolean isPrime(int num) {
			if (num <= 1) {
				return false;
			}
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					return false;
				}
			}
			return true;
		}
	}


