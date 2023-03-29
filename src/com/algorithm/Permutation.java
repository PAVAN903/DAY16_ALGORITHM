package com.algorithm;

import java.util.Arrays;

public class Permutation {

	// Iterative method to generate permutations of a string
	public static String[] generatePermutationsIteratively(String str) {
		// Convert the string to a character array
		char[] arr = str.toCharArray();
		// Initialize the permutation array with the first permutation
		String[] permutations = { new String(arr) };
		// Iterate through each character in the string
		for (int i = 1; i < arr.length; i++) {
			// For each character, generate all possible permutations
			for (int j = i; j > 0; j--) {
				// Swap the current character with the previous one
				char temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
				// Add the new permutation to the array
				permutations = Arrays.copyOf(permutations, permutations.length + 1);
				permutations[permutations.length - 1] = new String(arr);
			}
		}
		// Return the array of permutations
		return permutations;
	}

	// Recursive method to generate permutations of a string
	public static String[] generatePermutationsRecursively(String str) {
		// Base case: if the string is empty, return an empty array
		if (str.length() == 0) {
			return new String[] { "" };
		}
		// Recursive case: generate permutations of the substring after the first
		// character
		String[] permutations = generatePermutationsRecursively(str.substring(1));
		// Create a new array to hold the permutations of the current string
		String[] newPermutations = new String[permutations.length * str.length()];
		int index = 0;
		// Insert the first character into each position of each permutation
		for (String permutation : permutations) {
			for (int i = 0; i < str.length(); i++) {
				newPermutations[index++] = permutation.substring(0, i) + str.charAt(0) + permutation.substring(i);
			}
		}
		// Return the array of permutations
		return newPermutations;
	}

	public static void main(String[] args) {
		String str = "test";
		// Generate permutations using both methods
		String[] permutations1 = generatePermutationsIteratively(str);
		String[] permutations2 = generatePermutationsRecursively(str);
		// Check if the arrays are equal
		boolean equal = Arrays.equals(permutations1, permutations2);
		System.out.println("Permutations generated using iterative method: " + Arrays.toString(permutations1));
		System.out.println("Permutations generated using recursive method: " + Arrays.toString(permutations2));
		System.out.println("Are the arrays equal? " + equal);
	}
}
