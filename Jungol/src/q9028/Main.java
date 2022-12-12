package q9028;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		int res = 0;
		res = num / 4;
		System.out.printf("%d / 4 = %d\n", num, res);

		double res1 = 0;
		res1 = (double) num / 4.0;
		System.out.printf("%d / 4.0 = %.2f\n", num, res1);
	}
}
