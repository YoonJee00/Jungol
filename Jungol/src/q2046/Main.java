package q2046;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();

		int[][] Arr = new int[n][n];
		int num = 1;

		switch (m) {
		case 1:
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					Arr[i][j] = num;
				}
				num++;
			}
			break;

		case 2:
			for (int i = 0; i < n; i++) {
				num = 1;
				if (i % 2 == 0) {
					for (int j = 0; j < n; j++) {
						Arr[i][j] = num++;
					}
				} else {
					for (int j = n - 1; j >= 0; j--) {
						Arr[i][j] = num++;
					}
				}
			}

			break;

		case 3:
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (i == 0) {
						Arr[i][j] = num++;
					} else {
						Arr[i][j] = Arr[0][j] * (i + 1);
					}

				}
			}

			break;
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(Arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
