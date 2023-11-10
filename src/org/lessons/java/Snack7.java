package org.lessons.java;

import java.util.Scanner;

public class Snack7 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Inserisci il numero dei secondi");
		String secondiStr = in.nextLine();
		
		int secondiTotali = Integer.valueOf(secondiStr);
		
		int ore = secondiTotali / 3600;
		int minuti = (secondiTotali % 3600) / 60;
		int secondi = secondiTotali % 60;
		
		String orarioFormattato = String.format("%02d:%02d:%02d", ore, minuti, secondi);
				
		System.out.println("Risultato(Ore, Minuti, Secondi): " + orarioFormattato);
		
		in.close();
	}

}
