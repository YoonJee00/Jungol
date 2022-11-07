package q593;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (;;) {

			int num1 = sc.nextInt();
			char num2 = (char) num1;

			if (33 <= num1 && num1 <= 127) {
				System.out.print("ASCII code =? ");
				System.out.println(num2);
			} else {
				System.out.print("ASCII code =? ");
				break;
			}
			sc.close();
		}
	
	}

}
