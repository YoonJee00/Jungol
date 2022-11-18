package q1856;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();

		int arr[][] = new int[n][m];
		int num = 1;

		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < m; j++) {
					arr[i][j] = num++;
					System.out.printf("%d ", arr[i][j]);
				}
			} else {
				for (int j = m - 1; j >= 0; j--) {
					arr[i][j] = num++;
					System.out.printf("%d ", arr[i][j]);
				}
			}
			System.out.println();
		}

	}

}
