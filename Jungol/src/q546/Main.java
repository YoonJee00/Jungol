package q546;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		int sum = 0;
		int count = 0;

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			count++;
			sum += arr[i];
		}
		sc.close();

		if ((double) sum / (double) count >= 80) {
			System.out.printf("avg : %.1f\n", (double) sum / (double) count);
			System.out.println("pass");
		} else {
			System.out.printf("avg : %.1f\n", (double) sum / (double) count);
			System.out.println("fail");
		}

	}

}
