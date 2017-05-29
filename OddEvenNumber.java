
package oddevennumber;

import java.util.Scanner;

public class OddEvenNumber {

 
    public static void main(String[] args) {
         int x;
           Scanner input =new Scanner(System.in);
           System.out.println("enter any number");
           x=input.nextInt();
           if (x%2==0)
           {
               System.out.println("even number");
           }
               else
           {
               System.out.println("odd number");
           }
   }
}
