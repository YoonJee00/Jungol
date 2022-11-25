package q1309;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(factorial(num));
		sc.close();
	}

	static long factorial(int num) {
		if (num <= 1) {
			System.out.println("1! = 1");
			return num;
		} else {
			System.out.printf("%d! = %d * %d!\n", num, num, num - 1);
			return factorial(num - 1) * num;
		}
	}

}
