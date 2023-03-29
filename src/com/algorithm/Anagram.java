package com.algorithm;

import java.util.Arrays;

public class Anagram {
	static boolean anaGram(char[] str1, char[] str2) {

		int n1 = str1.length;
		int n2 = str2.length;
		if (n1 != n2)
			return false;
		Arrays.sort(str1);
		Arrays.sort(str2);
		for (int i = 0; i < n1; i++)
			if (str1[i] != str2[i])
				return false;

		return true;
	}

	public static void main(String[] args) {
		char str1[]= {'e','a','r','t','h'};
		char str2[]= {'h','e','n','r','t'};
		if(anaGram(str1,str2)) {
			System.out.println("two strings are "+"anagram of are each other");
		}else {
			System.out.println("two strings are "+"anagram of are not each other");
				
		}

	}

}
