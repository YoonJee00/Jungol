package q524;

import java.util.Scanner;

public class q524A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		sc.close();

		boolean a = (x != 0);
		boolean b = (y != 0);

		System.out.println((a && b) + " " + (a || b));

	}

}