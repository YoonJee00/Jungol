package q1303;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();

		int m = 1;

		for (int i = 0; i < num1; i++) {
			for (int j = 0; j < num2; j++) {
				System.out.printf("%d ", m++);
			}
			System.out.println();
		}
	}
}
