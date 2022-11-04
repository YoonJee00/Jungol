package q537;
import java.util.Scanner;

public class q537A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();
		
		System.out.println(inp);
		
		int sum = 0;
		for(int i=1; i <= inp; i++) {
			sum = sum + i; // sum += i;
		}
		System.out.println(sum);

	}

}
