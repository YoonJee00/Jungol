package q576;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String b = sc.next();
		int c = sc.nextInt();
		sc.close();

		if (b.equals("+")) {
			System.out.printf("%d + %d = %d\n", a, c, a + c);
		} else if (b.equals("-")) {
			System.out.printf("%d - %d = %d\n", a, c, a - c);
		} else if (b.equals("*")) {
			System.out.printf("%d * %d = %d\n", a, c, a * c);
		} else if (b.equals("/")) {
			System.out.printf("%d / %d = %d\n", a, c, a / c);
		} else {
			System.out.printf("%d %s %d = 0\n", a, b, c);
		}
	}

}
