package q129;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (;;) {

			System.out.print("Base = ");
			int base = sc.nextInt();
			System.out.print("Height = ");
			int height = sc.nextInt();
			double result = (double) height * base / 2;
			System.out.printf("Triangle width = %.1f\n", result);
			System.out.print("Continue? ");
			String YN = sc.next();

			if (YN.equals("Y") || YN.equals("y")) {
				continue;
			} else {
				sc.close();
				break;
			}
		}
	}
}
