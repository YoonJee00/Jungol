package q571;

import java.util.Scanner;

public class q571A {
	String str = "~!@#$^&*()_+|";

	void outp() {
		System.out.println(str);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		q571A main = new q571A();
		for (int i = 0; i < N; i++) {
			main.outp();
		}
	}
}
