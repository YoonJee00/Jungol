package q534;

import java.util.Scanner;

public class q534A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		sc.close();

		System.out.println(c);

		if (c == 'A') {
			System.out.println("Excellent");
		} else if (c == 'B') {
			System.out.println("Good");
		} else if (c == 'C') {
			System.out.println("Usually");
		} else if (c == 'D') {
			System.out.println("Effort");
		} else {
			System.out.println("error");
		}

	}

}
