package q578;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();

		if (num1 < num2) {
			for (int i = num1; i <= num2; i++) {
				System.out.printf("== %ddan ==\n", i);
				for (int j = 1; j <= 9; j++) {
					System.out.printf("%d * %d = %2d\n", i, j, i * j);
				}
				System.out.println();
			}
		} else if (num2 < num1) {
			for (int i = num2; i <= num1; i++) {
				System.out.printf("== %ddan ==\n", i);
				for (int j = 1; j <= 9; j++) {
					System.out.printf("%d * %d = %2d\n", i, j, i * j);
				}
				System.out.println();
			}
		}

	}

}
