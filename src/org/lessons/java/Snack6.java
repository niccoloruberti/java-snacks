package org.lessons.java;

import java.util.Scanner;

public class Snack6 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Inserisci un numero:");
		String numStr = in.nextLine();
		
		for ( int x = 0; x < numStr.length(); x++) {
			
			char c = numStr.charAt(x);
			
			String strC = c + "";
			
			int num = Integer.valueOf(strC);
			
			System.out.print(num);
			
		}
		
		

	}

}
