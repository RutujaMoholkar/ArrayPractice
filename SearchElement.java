package ArrayCode;

import java.util.Scanner;

/*Que.6---Write a Java program that searches for a specific element in an array and prints its index.
*/

public class SearchElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[6];

		System.out.println("Enter elements of an array: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter an element to search: ");
		int element = sc.nextInt();

		int index = -1;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == element) {
				index = i;
				break;
			}
		}

		System.out.println("Index of element " + element + " is : " + index);
	}

}
