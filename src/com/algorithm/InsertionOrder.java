package com.algorithm;

import java.util.Scanner;

public class InsertionOrder {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of words to be sorted: ");
	        int n = scanner.nextInt();
	        String[] words = new String[n];
	        System.out.println("Enter " + n + " words to be sorted:");
	        for (int i = 0; i < n; i++) {
	            words[i] = scanner.next();
	        }
	        scanner.close();
	        // Sort the array using insertion sort algorithm
	        for (int i = 1; i < n; i++) {
	            String key = words[i];
	            int j = i - 1;
	            while (j >= 0 && words[j].compareTo(key) > 0) {
	                words[j + 1] = words[j];
	                j = j - 1;
	            }
	            words[j + 1] = key;
	        }
	        // Print the sorted array
	        System.out.println("Sorted words:");
	        for (String word : words) {
	            System.out.println(word);
	        }
	    }
	}



