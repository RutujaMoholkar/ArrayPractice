package ArrayCode;

/* Que3 --Write a Java program that calculates and prints the sum of all elements in an integer array.

 */
import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];

		System.out.println("Enter elements of an array: ");

		// Taking array elements from user
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int sum = 0;
		for (int val : arr) {
			sum = sum + val;
		}
		System.out.println("Sum of all the array elements is : " + sum);
	}

}
