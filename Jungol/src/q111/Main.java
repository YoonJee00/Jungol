package q111;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kr = sc.nextInt();
		int math = sc.nextInt();
		int eng = sc.nextInt();
		int com = sc.nextInt();
		sc.close();

		int sum = kr + math + eng + com;
		int avg = sum / 4;

		System.out.println("sum " + sum);
		System.out.println("avg " + avg);

	}

}
