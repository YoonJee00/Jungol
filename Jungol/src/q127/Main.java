package q127;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int count = 0;

		for (;;) {
			int num = sc.nextInt();

			if (0 <= num && num < 101) {
				count++;
				sum += num;
			} else if (101 <= num) {
				sc.close();
				break;
			}
		}
		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f", (double) sum / count);
	}

}
