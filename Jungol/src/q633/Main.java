package q633;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (;;) {
			System.out.println("1. Korea");
			System.out.println("2. USA");
			System.out.println("3. Japan");
			System.out.println("4. China");
			System.out.print("number? ");

			int num = sc.nextInt();
			if (num == 1) {
				System.out.println("\nSeoul");
			} else if (num == 2) {
				System.out.println("\nWashington");
			} else if (num == 3) {
				System.out.println("\nTokyo");
			} else if (num == 4) {
				System.out.println("\nBeijing");
			} else {
				System.out.println("\nnone");
				sc.close();
				break;
			}

		}

	}

}
