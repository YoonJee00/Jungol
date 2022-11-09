package q539;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int a[] = new int[100];

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			sum += a[i];

			if (a[i] >= 100) {
				System.out.println(sum);
				break;
			}
		}
		double avg = (double) (sum / a.length);

		System.out.printf("%.1f", avg);

	}

}
