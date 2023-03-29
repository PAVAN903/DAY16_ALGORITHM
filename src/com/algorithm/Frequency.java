package com.algorithm;

import java.util.Hashtable;

public class Frequency {

	public static void main(String[] args) {
	
			String phrase = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
					
			//hashtable variablke called FR that stores key and integer value
			Hashtable<String, Integer> fr = new Hashtable<>();
			
			// split sentence to word
			String[] words = phrase.split(" ");
			// count frequency of word,loop through each word in WORDS aray checks whether its already in FR hashtable.
			//if key exists ,increments bvalue by 1.if doesnot it adds key with value of 1 to hash table
			for (String word : words) {
				if (fr.containsKey(word)) {
					fr.put(word, fr.get(word) + 1);
				} else {
					fr.put(word, 1);
				}
				// print frequency 
				for (String worrd : fr.keySet()) {
					System.out.println(word + ": " + fr.get(word));
				}

			}
		}


	}


