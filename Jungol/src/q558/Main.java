package q558;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[100];
		int b = 0;

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();

			if (a[i] == 0) {
				sc.close();
				break;
			}
		}

		for (int i = b; i > a.length; i--) {
			System.out.print(a[i] + " ");
		}

	}

}
