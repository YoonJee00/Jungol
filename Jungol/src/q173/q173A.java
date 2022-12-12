package q173;

import java.util.Scanner;

public class q173A {
	public int method(int x, int y) {
		if (x > y) {
			return x * x - y * y;
		} else {
			return y * y - x * x;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		q173A q = new q173A();
		int z = q.method(a, b);
		System.out.println(z);

	}

}
