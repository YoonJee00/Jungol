package q632;

import java.util.Scanner;

public class q632A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		sc.close();

		if (num1 > num2) {
			if (num2 > num3) {
				System.out.println(num3);
			} else {
				System.out.println(num2);
				}
			} else {
				if (num1 > num3) {
				System.out.println(num3);
				} else {
					System.out.println(num1);
				}
			}

	}

}

/*
min = (a < b) ? a : b;
min = (min < c) ? min : c;

조건이 true면 ? 뒤의 값이 괄호 안의 값으로, 아니면 그 옆의 값이 괄호 안으로.
*/