package q632;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();

		if (a < b) {
			if (a < c) {
				System.out.println(a);
			} else if (c < a) {
				System.out.println(c);
			}
		}

		if (a > b) {
			if (b < c) {
				System.out.println(b);
			} else if (c < b) {
				System.out.println(c);
			}
		}

		if (a > c) {
			if (c < b) {
				System.out.println(c);
			} else if (b < c) {
				System.out.println(b);
			}
		}

		if (b < c) {
			if (a < b) {
				System.out.println(a);
			} else if (a > b) {
				System.out.println(b);
			}
		}

		if (a < c) {
			if (a < b) {
				System.out.println(a);
			} else if (a > b) {
				System.out.println(b);
			}
		}

		if (b > c) {
			if (c < a) {
				System.out.println(c);
			} else if (c > a) {
				System.out.println(a);
			}
		}

	}

}
