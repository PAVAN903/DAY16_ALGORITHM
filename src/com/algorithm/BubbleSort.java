package com.algorithm;

import java.util.Scanner;

public class BubbleSort {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of integers to be sorted: ");
	        int n = scanner.nextInt();
	        int[] nums = new int[n];
	        System.out.println("Enter " + n + " integers to be sorted:");
	        for (int i = 0; i < n; i++) {
	            nums[i] = scanner.nextInt();
	        }
	        // Sort the array using bubble sort algorithm
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (nums[j] > nums[j + 1]) {
	                    // Swap the elements at indices j and j+1
	                    int temp = nums[j];
	                    nums[j] = nums[j + 1];
	                    nums[j + 1] = temp;
	                }
	            }
	        }
	        // Print the sorted array
	        System.out.println("Sorted integers:");
	        for (int num : nums) {
	            System.out.println(num);
	        }
	    }
	}



