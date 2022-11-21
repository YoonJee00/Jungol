package q128;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int count3 = 0;
		int count5 = 0;
		int count15 = 0;
		int count = 0;

		Scanner sc = new Scanner(System.in);

		for (;;) {
			int num = sc.nextInt();

			if (num != 0 && num % 3 == 0) {
				count3++;
			} else if (num != 0 && num % 5 == 0) {
				count5++;
			} else if (num != 0 && num % 3 == 0 && num % 5 == 0) {
				count15++;
			} else if (num < 0 || num == 0) {
				sc.close();
				break;
			}

			if (num != 0) {
				count++;
			}
		}
		System.out.println(count - count3 - count5 + count15);

	}

}
