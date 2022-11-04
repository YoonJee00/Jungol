package q534;

import java.util.Scanner;

public class q534B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		sc.close();

		System.out.println(c);

		switch (c) {
		case 'A':
			System.out.println("Excellent");
			break;
		case 'B':
			System.out.println("Good");
			break;
		case 'C':
			System.out.println("Usually");
			break;
		case 'D':
			System.out.println("Effort");
			break;
		case 'E':
			System.out.println("Failure");
			break;
		default:
			System.out.println("error");
		}

	}

}
