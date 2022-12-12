package q134;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];

		int ceven = 0;
		int codd = 0;
		for (int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();

			if (arr[i] % 2 == 0) {
				ceven++;
			} else {
				codd++;
			}
		}
		sc.close();
		System.out.println("even : " + ceven);
		System.out.println("odd : " + codd);
	}

}
