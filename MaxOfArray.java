package ArrayCode;

import java.util.Scanner;

/* Que.5 ---Create a Java program that finds and prints the maximum value in an array of integers.

 */

public class MaxOfArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];

		System.out.println("Enter elements of an array: ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {

			if (arr[i] > max)
				max = arr[i];
		}
		System.out.println("Maximum value in an array is : " + max);

	}

}
