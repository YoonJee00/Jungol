package q120;

import java.util.Scanner;

public class q120A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();
		
		System.out.println(Math.abs(n1 - n2));
//		절대값으로 표시해주는 것 : Math.abs()

	}

}
