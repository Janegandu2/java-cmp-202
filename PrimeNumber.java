
package primenumber;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
            int y;
        Scanner input=new Scanner(System.in);
        System.out.println("enter any number");
        y=input.nextInt();
        if (y%1==0)
        {
            System.out.println("prime number");
        }
            else
        {
            System.out.println("not a prime number");
        }
    }
    }
