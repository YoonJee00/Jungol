package q537;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i = 1;
		int sum = 0;
		sc.close();
		
		while (i <= num) { 
			sum += i;
			i++;
			
		}
		
		System.out.println(sum);
	}

}
