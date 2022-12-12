package q592;

import java.util.Scanner;

public class Main {
	static int sum = 0;

	public static int func(int input) {
		if (input == 1) {
			sum += input * input;
			return sum;
		} else {
			sum += (input % 10) * (input % 10);
			return func(input / 10); // 여기서 에러
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.close();

		System.out.println(func(input));

	}

}
