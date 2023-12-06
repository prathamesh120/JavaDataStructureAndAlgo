package array;

import java.util.*;

public class ArrayProject {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("How many days' tempratures? ");
		int numDays = sc.nextInt();
		int[] temps = new int[numDays];
		// Record temp and find average
		
		int sum = 0;
		for (int i = 0; i< numDays;i++) {
			System.out.print("Days " + (i+1) + "'s high temp: ");
			temps[i] = sc.nextInt();
			sum += temps[i];
		}
		
		double average = sum /numDays;
		// count days above aveg
		int above = 0;
		for (int i = 0; i< temps.length; i++) {
			if(temps[i] > average) {
				above++;
			}
		}
		System.out.println();
		System.out.println("Average Temp = "+average);
		System.out.println("Days above average is   "+above);
	}
}
