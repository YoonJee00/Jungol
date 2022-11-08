package q560;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];

		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();

			if (min > a[i]) {
				min = a[i];
			}
		}
		sc.close();
		System.out.printf("%d\n", min);

	}

}
