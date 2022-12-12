package q545;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];

		int count1 = 0, count2 = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

			if (arr[i] % 3 == 0) {
				count1++;
			}
			if (arr[i] % 5 == 0) {
				count2++;
			}
		}
		sc.close();
		System.out.println("Multiples of 3 : " + count1);
		System.out.println("Multiples of 5 : " + count2);
	}

}
