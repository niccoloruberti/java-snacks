package org.lessons.java;

import java.util.Arrays;

public class Snack9 {

	public static void main(String[] args) {
		
		int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int nPari = 0;
		int nDispari = 0;
		
		for (int x = 0; x < input.length; x++) {
			if (input[x] % 2 == 0) {
				nPari++;
			} else {
				nDispari++;
			}
		}
		
		int[] outputPari = new int[nPari];
		int[] outputDispari = new int[nDispari];
		
		int indexPari = 0;
		int indexDispari = 0;
		
		for (int x = 0; x < input.length; x++) {
			if(input[x] % 2 == 0) {
				outputPari[indexPari] = input[x];
				indexPari++;
			} else {
				outputDispari[indexDispari] = input[x];
				indexDispari++;
			}
		}
		
		System.out.println("Numeri pari:" + Arrays.toString(outputPari));
		System.out.println("Numeri dispari:" + Arrays.toString(outputDispari));
		
	}

}
