package q577;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();

		if (num1 < num2) {
			System.out.printf("%d %d", num1 * 2, num2 / 2);
		} else if (num1 > num2) {
			System.out.printf("%d %d", num1 / 2, num2 * 2);
		}

	}

}
