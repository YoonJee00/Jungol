package q632;

import java.util.Scanner;

public class q632B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		sc.close();
		
		int min = (num1 > num2) ? ((num2 > num3) ? num3 : num2) : ((num1 > num3) ? num3 : num1);
		
		System.out.println(min);

	}

}
