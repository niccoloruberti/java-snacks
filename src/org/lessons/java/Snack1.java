package org.lessons.java;

import java.util.Scanner;

public class Snack1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		//chiedo un numero all'utente
		System.out.println("Inserisci un numero:");
		String numStr = in.nextLine();
		int num = Integer.valueOf(numStr);
		
		in.close();
		
		//se il numero è pari lo stampo altirmenti stampo il successivo
		if(num % 2 == 0) {
			System.out.println(num);
		} else {
			System.out.println(num + 1);
		}

	}

}
