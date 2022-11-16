package q123;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		if (num == 1) {
			System.out.println("Number? dog");
		} else if (num == 2) {
			System.out.println("Number? cat");
		} else if (num == 3) {
			System.out.println("Number? chick");
		} else {
			System.out.println("Number? I don't know.");

		}
	}
}
