package q152;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        int odd = 0;
        int even = 0;
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                odd += num[i];
            } else {
                even += num[i];
            }
        }

        System.out.println("odd : " + odd);
        System.out.println("even : " + even);
    }
}
