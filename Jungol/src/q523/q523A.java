package q523;

import java.util.Scanner;

public class q523A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		if (a > b) {
			System.out.printf("%d > %d --- true\n", a, b);
		} else {
			System.out.printf("%d > %d --- false\n", a, b);
		}

		if (a < b) {
			System.out.printf("%d < %d --- true\n", a, b);
		} else {
			System.out.printf("%d < %d --- false\n", a, b);
		}

		if (a >= b) {
			System.out.printf("%d >= %d --- true\n", a, b);
		} else {
			System.out.printf("%d >= %d --- false\n", a, b);
		}

		if (a <= b) {
			System.out.printf("%d <= %d --- ture\n", a, b);
		} else {
			System.out.printf("%d <= %d --- false\n", a, b);
		}
	}

}
