package q526;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		sc.close();

		int mul = 0;
		mul = (int) (num1 * num2);
		System.out.print(mul + " ");

		mul = (int) num1 * (int) num2;
		System.out.print(mul + " ");

	}

}
