package org.lessons.java;

import java.util.Scanner;

public class Snack5 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		boolean contained = false;
		
		do {
			System.out.println("inserisci una stringa");
			
			int caratteriAlfabetici = 0;
	        int numeri = 0;
	        int simboli = 0;
			
			String userString = in.nextLine().replaceAll("\s", "");
			
			for(int x = 0; x < userString.length(); x++) {
				char c = userString.charAt(x);
				
				if(Character.isLetter(c)) {
					caratteriAlfabetici++;
				} else if (Character.isDigit(c)) {
					numeri++;
				} else {
					simboli++;
				};
				
				if ( c == '0') {
					contained = true;
				};
			}
			
			System.out.println("caratteri alfabetici: " + caratteriAlfabetici);
			System.out.println("simboli: " + simboli);
			System.out.println("numeri: " + numeri);
			
		} while (contained == false);
		
		System.out.println("Stringa corretta!");
	}

}
