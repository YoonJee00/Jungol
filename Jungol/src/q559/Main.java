package q559;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double avg[] = { 85.6, 79.5, 83.1, 80.0, 78.2, 75.0 };

		int a = sc.nextInt() - 1;
		int b = sc.nextInt() - 1;
		sc.close();

		System.out.printf("%.1f", avg[a] + avg[b]);

	}

}
