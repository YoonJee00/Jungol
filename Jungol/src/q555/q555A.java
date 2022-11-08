package q555;

import java.util.Scanner;

public class q555A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c[] = new char[10];

		for (int i = 0; i < c.length; i++) {
//			char w = sc.next().charAt(0);
//			c[i] = w;
			c[i] = sc.next().charAt(0);
		}

		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}

		sc.close();
	}

}
