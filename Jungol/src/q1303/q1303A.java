package q1303;

import java.util.Scanner;

public class q1303A {

	public static void main(String[] args) {
		int[][] ar;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();

		ar = new int[n][m];

		int num = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				ar[i][j] = num++;
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}
	}

}
