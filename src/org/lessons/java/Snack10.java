package org.lessons.java;

import java.util.Scanner;

public class Snack10 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		//chiedo due numeri all'utente
		System.out.print("Inserisci un numero intero:");
		int n1 = in.nextInt();
		System.out.print("Inserisci un'altro numero intero:");
		int n2 = in.nextInt();
		
		in.close();
		
		int sum = 0;
		int min;
		int max;
		
		if(n1 > n2) {
			max = n1;
			min = n2;
		} else {
			max = n2;
			min = n1;
		}
		
		if (n1 == n2) {
			sum = n1;
			System.out.println(sum);
			return;
		}
		
		int diff = max - min;
		
		for (int x = 1; x <= diff + 1; x++) {
			sum += min;
			min += 1;
		}
		
		System.out.println(sum);
		
	}

}
