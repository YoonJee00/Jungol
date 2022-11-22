package q129;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (;;) {
			int base = sc.nextInt();
			int height = sc.nextInt();
			double result = (double) height * base / 2;

			System.out.printf("Base = %d\n", base);
			System.out.printf("Height = %d\n", height);
			System.out.printf("Triangle width = %.1f\n", result);
			System.out.print("Continue? ");
			String YN = sc.next();

			if (YN.equals("Y") || YN.equals("y")) {
				System.out.print("Y");
				continue;
			} else {
				sc.close();
				System.out.print("N");
				break;
			}
		}

	}

}
