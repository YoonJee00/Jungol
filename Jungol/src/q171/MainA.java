package q171;

import java.util.Scanner;

public class MainA {
	public static int Sum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;

		do {
			num = sc.nextInt();
		} while (num < 1 || num > 1000);
		sc.close();
		System.out.println(Sum(num));
	}

}
