package org.lessons.java;

import java.util.Random;

public class Snack11 {

	public static void main(String[] args) {
		
		//creo 10 numeri casuali da 1 a 100
		
		int[] numbers = new int[10];
		
		Random rnd = new Random();
		
		for(int x = 0; x < 10; x++) {
			numbers[x] = rnd.nextInt(0, 101);
			System.out.println("numero[" + (x+1) + "]" + numbers[x]);
		}
		
		//cerco il max
		
		int max = Integer.MIN_VALUE;
		
		for (int x = 0; x < 10; x++) {
			
			if (numbers[x] > max) {
				max = numbers[x];
			}
			
		}
		
		//cerco il min
		
		int min = Integer.MAX_VALUE;
		
		for (int x = 0; x < 10; x++) {
			
			if (numbers[x] < min) {
				min = numbers[x];
			}
			
		}
		
		//cerco la media
		
		int avg = 0;
		
		for (int x = 0; x < 10; x++) {
				
				avg+= numbers[x];
			
		}
		
		avg = avg / numbers.length;
		
		System.out.println("massimo: " + max);
		System.out.println("minimo: " + min);
		System.out.println("media: " + avg);

	}

}
