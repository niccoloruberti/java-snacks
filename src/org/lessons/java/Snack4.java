package org.lessons.java;

import java.util.Scanner;

public class Snack4 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		//chiedo all'utente di inserire una stringa
		System.out.println("inserisci una stringa:");
		String userString = in.nextLine();
		
		String reverseString  = "";
		
		for (int x = 1; x <= userString.length(); x++) {
			
			char c = userString.charAt(userString.length() - x);
			reverseString += c;

		}
		
		if(userString.equals(reverseString)) {
			System.out.println("la parola " + userString + " è palindroma");
		} else {
			System.out.println("la parola non è palindroma");
		}

	}

}
