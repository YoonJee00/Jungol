package q598;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char w;

		for (;;) {
			String str = sc.next();
			w = str.charAt(0);

			if (w >= 65 && w <= 90) {
				System.out.println(w);
			} else if (w >= 97 && w <= 122) {
				System.out.println(w);
			} else if (w >= 48 && w <= 57) {
				System.out.println((int) w);
			} else {
				sc.close();
				break;
			}
		}

	}

}
