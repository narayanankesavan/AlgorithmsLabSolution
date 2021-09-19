package com.greatlearning.paymoney.main;

import java.util.Scanner;

//Lab 2 – Algorithms Problem Statement
//Question 1 
public class Transactions {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int size, target_size, target_value = 0, i, j, sum;
		int transactions[];

		System.out.println("Enter the size of transaction array:");

		// Get the size of transactions from user
		size = sc.nextInt();
		// Allocate an array of provided size
		transactions = new int[size];

		System.out.println("Enter the values of array:");

		// Get the elements of the array (in a loop)
		for (i = 0; i < size; i++) {
			transactions[i] = sc.nextInt();
		}

		// Get the number of targets
		System.out
				.println("Enter the total no of targets that needs to be achieved:");
		target_size = sc.nextInt();

		// Loop so many times (as number of targets)
		for (i = 0; i < target_size; i++) {
			// Get the target
			System.out.println("Enter the value of target:");
			target_value = sc.nextInt();

			// Again start a loop to calculate the sum
			sum = 0;
			for (j = 0; j < transactions.length; j++) {
				// sum till the element
				sum = sum + transactions[j];
				// check if target is reached
				if (sum >= target_value) {
					// print out the number of transactions when target is
					// reached
					System.out.println("Target acheived after " + (j + 1)
							+ " transactions");
					// We stop execution of the closest (inner) for loop
					break;
				}

				// We reached the final transaction and target is still not then
				// given Exception

				if (j == transactions.length - 1 && sum < target_value) {
					System.out.println("Given Target is not reached");
				}
			}
		}
	}
}
