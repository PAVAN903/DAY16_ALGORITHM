package com.algorithm;

public class PrimeNumber {
	    public static void main(String[] args) {
	        int n = 1000;
	        System.out.println("Prime numbers between 0 and 1000:");
	        for (int i = 2; i <= n; i++) {
	            boolean isPrime = true;
	            for (int j = 2; j <= Math.sqrt(i); j++) {
	                if (i % j == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	            if (isPrime) {
	                System.out.print(i + " ");
	            }
	        }
	    }
	}



