package q171;

import java.util.Scanner;

public class q171A {
	public int sumFunc(int p) {
		int sum = 0;
		for (int i = 1; i <= p; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();

		q171A m = new q171A();
		int ret = m.sumFunc(inp);
		System.out.println(ret);

	}

}
