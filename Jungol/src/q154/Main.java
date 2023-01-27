package q154;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num[] = new double[6];
        double sum = 0;

        for(int i = 0; i < 6; i++) {
            num[i] = sc.nextDouble();
            sum += num[i];
        }

        System.out.printf("%.1f", (double)sum / 6);
        sc.close();
    }
}
