package q599;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] word = new char[100];

        for (int i = 0; i < str.length(); i++) {
            word[i] = str.charAt(i);

            if (word[i] >= 65 && word[i] <= 90) {
                System.out.print(word[i]);
            } else if (word[i] >= 97 && word[i] <= 122) {
                System.out.print((char)(word[i] - 32));
            }
        }

        sc.close();
    }
}
