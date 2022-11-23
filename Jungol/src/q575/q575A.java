package q575;

import java.util.Scanner;

public class q575A {
	public int kpow(int a, int b) {
		int res = a;
		for (int i = 1; i < b; i++) {
			res *= a;
		}

		if (b == 0) {
			return 1;
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();

		q575A m = new q575A();
		System.out.println(m.kpow(x, y));

//		double ret = Math.pow(x, y);
//		System.out.println((int)ret);
	}
}
