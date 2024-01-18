package ArrayCode;

import java.util.Scanner;

/* Que4--- Create a Java program that finds and prints the average of values in a double array.
*/

public class AverageOfArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];

		System.out.println("Enter array elements: ");

		// Taking array elements from user
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int sum = 0;
		for (int val : arr) {
			sum = sum + val;
		}
		double avg = sum / arr.length;

		System.out.println("Average of an array is  : " + avg);
	}

}
