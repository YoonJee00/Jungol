package q124;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		if (num == 2) {
			System.out.println("28");
		} else if (num % 2 == 1 && num < 8) {
			System.out.println("31");
		} else if (num == 4 || num == 6 || num == 9 || num == 11) {
			System.out.println("30");
		} else if (num == 8 || num == 10 || num == 12) {
			System.out.println("31");
		}

	}

}
