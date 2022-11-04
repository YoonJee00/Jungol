package q538;

import java.util.Scanner;

public class q538C {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      
      int inp;
      do {
         System.out.print("number? ");
         inp=sc.nextInt();
         if(inp>0) {
            System.out.println("positive integer");
         } else if(inp<0) {
            System.out.println("negative number");
         }
         
      } while(inp!=0);
      sc.close();
     
    }

}
