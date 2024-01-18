package ArrayCode;

import java.util.Scanner;

/*Que-1  Write a Java program to print the reverses of an array.

 */

public class ArrayElementInReverseOrder {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];

		System.out.println("Enter array elements : ");
		// Taking array elements from user
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		// Printing original array elements
		System.out.println("Original array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		System.out.println("Array in reverse order: ");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}

	}

}
