package com.algorithm;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the name of the file containing the word list: ");
	        String filename = scanner.nextLine();
	        System.out.print("Enter the word to search for: ");
	        String searchWord = scanner.nextLine();
	        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
	            // Read the words from the file and store them in an array
	            String[] words = br.readLine().split(",");
	            // Sort the array using Arrays.sort method
	            Arrays.sort(words);
	            // Perform binary search on the sorted array
	            int index = Arrays.binarySearch(words, searchWord);
	            if (index >= 0) {
	                System.out.println("The word '" + searchWord + "' was found in the list.");
	            } else {
	                System.out.println("The word '" + searchWord + "' was not found in the list.");
	            }
	        } catch (IOException e) {
	            System.out.println("Error reading file: " + e.getMessage());
	        }
	    }
	}



