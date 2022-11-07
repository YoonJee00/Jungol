package q539;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int avg = 0;
		
		for (;;) {
			int num = sc.nextInt();
			sum += num;
			
			if (num >= 100) {
				System.out.println(sum);
				break;
			}
		}
		
	
		
		

	}

}
