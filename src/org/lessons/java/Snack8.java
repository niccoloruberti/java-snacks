package org.lessons.java;

import java.util.Scanner;

public class Snack8 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("inserisci una parola: ");
		String inputStr = in.nextLine();
		String outputStr = "";
		
		for (int x = 0; x < inputStr.length(); x++) {
			
			char c = inputStr.charAt(x);
			
			if (c == 'a') {
				
				outputStr += 'o';
				
			} else if(c == 'o') {
				
				outputStr += 'a';
				
			} else {
				
				outputStr += c;
				
			}
			
		}
		
		System.out.println(outputStr);

	}

}
