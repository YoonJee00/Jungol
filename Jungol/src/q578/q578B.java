package q578;

import java.util.Scanner;

class Gugudan {
	private int inp1;
	private int inp2;

	public void input() {
		Scanner sc = new Scanner(System.in);
		int inp1 = sc.nextInt();
		int inp2 = sc.nextInt();
		sc.close();
	}

	public void swap() {
		if (inp1 > inp2) {
			int tmp = inp1;
			inp1 = inp2;
			inp2 = tmp;
		}
	}

	public void print() {
		for (int i = inp1; i <= inp2; i++) {
			System.out.println("== " + i + "dan ==");
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + " * " + j + " = ");
				System.out.printf("%2d\n", i * j);
			}
			System.out.println();
		}
	}
}

public class q578B {

	public static void main(String[] args) {
		Gugudan gu = new Gugudan();
		gu.input();
		gu.swap();
		gu.print();
	}

}
