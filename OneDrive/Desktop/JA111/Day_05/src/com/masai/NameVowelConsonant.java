package com.masai;

import java.util.Scanner;

public class NameVowelConsonant {
	  static int getVowelCount(String name) {
	  
		Scanner input = new Scanner(System.in) ;
		System.out.println("Enter the Name:");
			String name1 = input.nextLine();

			char[] nameArray = name1.toCharArray();
			int vowels = 0;
   

			for (char c : nameArray) {
			  if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
			      c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
				  vowels++;
			  }
			}
			return vowels;
		}
	  
	  public static void main(String[] args) {
	    System.out.println("Total vowel in prashant is " + getVowelCount("prashant"));
	    
	  }
	}