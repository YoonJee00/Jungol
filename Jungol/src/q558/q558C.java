package q558;

import java.util.Scanner;

public class q558C {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[100];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

			if (arr[i] == 0) {
				for (i = i - 1; i >= 0; i--) {
					System.out.print(arr[i] + " ");
				}
				break;
			}
		}
		sc.close();
	}
}