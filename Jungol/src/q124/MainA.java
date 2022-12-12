package q124;

import java.util.Scanner;

public class MainA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();

		if (1 <= month && month <= 12) {
			switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("31");
				break;

			case 2:
				System.out.println("28");
				break;

			default:
				System.out.println("30");
				break;
			}
		} else {
			System.out.println("범위밖");
		}
		sc.close();
	}

}
