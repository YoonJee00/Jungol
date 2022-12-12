package q173;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();

		int res = 0;

		if (num1 > num2) {
			res = num1 * num1 - num2 * num2;
			System.out.println(res);
		} else {
			res = num2 * num2 - num1 * num1;
			System.out.println(res);
		}

	}

}
