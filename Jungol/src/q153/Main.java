package q153;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int save;
        int num[] = new int[100];

        for (int i = 0; i < 100; i++) {
            num[i] = sc.nextInt();
            if (num[i] == -1) {
                count = i;
                break;
            }
        }

        save = count - 3;
        for (int i = save; i < count; i++) {
            if (i >= 0) {
                System.out.print(num[i] + " ");
            }
        }
    }
}
