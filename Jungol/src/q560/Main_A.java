package q560;

import java.util.Scanner;

public class Main_A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numArr = new int[10];
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = sc.nextInt();
			
			if (min > numArr[i]) {
				min = numArr[i];
			}
		}
		sc.close();
		System.out.println(min);
	}

}
