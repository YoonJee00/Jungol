package q574;

import java.util.Scanner;

public class q574B {
	public int maxFunc(int[] ar) {
		int max = -1;
		for(int i = 0; i < ar.length; i++) {
			if(max < ar[i]) {
				max = ar[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inp = new int[3];
		for(int i = 0; i < inp.length; i++) {
			inp[i] = sc.nextInt();
		}
		sc.close();
		
		for(int i = 0; i < inp.length; i++) {
			System.out.print(inp[i] + " ");
		}
		
		q574B m = new q574B();
		int ret = m.maxFunc(inp);
		System.out.println(ret);

	}

}
