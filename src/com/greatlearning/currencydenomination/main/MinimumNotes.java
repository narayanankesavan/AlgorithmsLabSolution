package com.greatlearning.currencydenomination.main;

import java.util.Scanner;

import com.greatlearning.currencydenomination.MergeSortImplementation;

//Lab 2 – Algorithms Problem Statement
//Question 2 
public class MinimumNotes {

	private static Scanner sc = new Scanner(System.in);
	public static boolean status;

	public static void main(String[] args) {

		int size, notes[], amount, i;

		// get the number of denominations
		System.out.println("Enter the size of currency denominations:");
		size = sc.nextInt();

		// allocate array to hold denominations
		notes = new int[size];
		System.out.println("Enter the currency denomination value:");

		// get the denominations in loop
		for (i = 0; i < size; i++) {
			notes[i] = sc.nextInt();
		}

		// sort using merge sort
		MergeSortImplementation ms = new MergeSortImplementation();
		ms.sort(notes, 0, notes.length - 1);

		// get the amount
		System.out.println("Enter the amount you want to pay:");
		amount = sc.nextInt();

		int[] noteCounter = new int[size];
		// count notes
		for (i = 0; i < notes.length; i++) {
			if (amount >= notes[i]) {
				noteCounter[i] = amount / notes[i];
				amount = amount - noteCounter[i] * notes[i];
			}
			if (i == notes.length - 1 && amount != 0) {
				System.out.println("Not Possible to Pay!!");
				status = true;
			}
		}

		// print notes
		if (status == false) {
			System.out
					.println("Your payment approach in order to give minium number of notes will be:");
			for (i = 0; i < notes.length; i++) {
				if (noteCounter[i] != 0) {
					System.out.println(notes[i] + " : " + noteCounter[i]);
				}
			}
		}
	}

}
