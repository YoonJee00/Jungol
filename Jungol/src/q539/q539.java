package q539;

import java.util.Scanner;

public class q539 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[100];

		int i = 0;
		int sum = 0;

		for (;; i++) {
			ar[i] = sc.nextInt();
			if (ar[i] >= 100) {
				sc.close();
				break;
			}
		}

		for (int j = 0; j <= i; j++) {
			sum += ar[j];
		}
		System.out.println(sum);
		System.out.printf("%.1f\n", (double) sum / (i + 1));

	}

}
