package q126;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count1 = 0;
		int count2 = 0;

		for (;;) {
			int num = sc.nextInt();

			if (num > 0 && num % 2 == 0) {
				count1++;
			} else if (num > 0 && num % 2 == 1) {
				count2++;
			} else if (num == 0) {
				sc.close();
				break;
			}

		}
		System.out.println("odd : " + count2);
		System.out.println("even : " + count1);
	}
}
