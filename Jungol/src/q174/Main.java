package q174;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		score();
	}

	public static void score() {
		int[][] arr = new int[4][4];
		int sum = 0;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = sc.nextInt();
				sum += arr[i][j];
			}
			arr[i][3] = sum;
			sum = 0;
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				sum += arr[j][i];
			}
			arr[3][i] = sum;
			sum = 0;
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();

	}

}
