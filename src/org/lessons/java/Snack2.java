package org.lessons.java;

import java.util.Random;
import java.util.Scanner;

public class Snack2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String[] nomi = {"Mario", "Luigi", "Giovanna", "Anna", "Carlo", "Maria", "Luca", "Giuseppe", "Elena", "Francesca"};
		String[] cognomi = {"Rossi", "Bianchi", "Verdi", "Russo", "Ferrari", "Esposito", "Romano", "Gallo", "Conti", "Marino"};
		
		if(nomi.length == cognomi.length) {
		
			for (int x = 0; x < nomi.length; x++) {
				
				Random r = new Random();
				int indNameR = r.nextInt(nomi.length);
				int indSurnameR = r.nextInt(nomi.length);
				
				String nomeInvitato = nomi[indNameR] + " " + cognomi[indSurnameR] ;
				
				System.out.println(nomeInvitato);
				
			}
		} else {
			System.out.println("La lista dei nomi e dei cognomi non sono della stessa lunghzza");
		}

	}

}
