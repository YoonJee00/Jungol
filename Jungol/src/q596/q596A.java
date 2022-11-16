package q596;

import java.util.Scanner;

public class q596A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp = sc.next();
		int n = sc.nextInt();
		sc.close();
		
		for(int i = inp.length() - 1; i >= 0; i--, n--) {
			System.out.print(inp.charAt(i));
		}

	}

}
