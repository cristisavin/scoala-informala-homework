import java.util.Scanner;

// 11. Write pseudo code that will perform the following. 
//  a) Read in 5 separate numbers.
//  b) Calculate the average of the five numbers.
//  c) Find the smallest (minimum) and largest (maximum) of the five entered numbers.
//  d) Write out the results found from steps b and c with a message describing what they are

public class AverageMinMax {

	public static void main(String[] args) {
		
		// a) Read in 5 separate numbers.
		System.out.println("Please input 5 numbers: ");
		Scanner scanner = new Scanner(System.in);
		// se declara 5 variabile de tip integer si se initializeaza cu cele 5 numere introduse de user:
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		int num4 = scanner.nextInt();
		int num5 = scanner.nextInt();
		
		// b) Calculate the average of the five numbers.
		int average = (num1 + num2 + num3 + num4 + num5)/5;
		
		// c) Find the smallest (minimum) and largest (maximum) of the five entered numbers.
		int[] numbers = {num1, num2, num3, num4, num5};
		// Find the smallest (minimum) number
		int min = num1;
		for (int i=1; i<numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		// Find the largest (maximum) number
		int max = num1;
		for (int i=1; i<numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		// d) Write out the results found from steps b and c
		System.out.println("The average is: " + average);
		System.out.println("The smallest number is " + min + " and the largest is " + max + ".");
	}
}
