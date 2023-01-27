package q155;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = {"J", "U", "N", "G", "O", "L"};
        String in = " ";
        int cnt = 0;

        in = sc.next();

        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals(in)) {
                System.out.println(i);
                cnt++;
            }
        }

        if(cnt == 0) {
            System.out.println("none");
        }
    }
}
