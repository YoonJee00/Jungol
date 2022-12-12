package q111;

import java.util.Scanner;

public class q111A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] score = new int[4];
		for (int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
		}
		sc.close();

		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		System.out.println("sum " + sum);
		System.out.println("avg " + sum / score.length);

	}

}
