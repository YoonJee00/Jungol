package q533;

import java.util.Scanner;

public class q533A {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String a = sc.next();
      int age = sc.nextInt();
      sc.close();

      switch(a) {
      case "M":
         if(age>=20) {
            System.out.println("MAN");
         } else {
            System.out.println("WOMAN");
         }
         break;
      case "F":
         if(age<20) {
            System.out.println("BOY");
         } else {
            System.out.println("GIRL");
         }
         break;
      }
   }
}