
package Main;

import java.util.Scanner;


public class Problem2 {
    public static void main(String[] args) {
        /*for(int i=1; i<=99; i++){
            System.out.println(i);
            i=i+1;
        }*/
       Scanner sc = new Scanner(System.in);
       System.out.println("Input a number:");
       int number = sc.nextInt();
       if(number % 2 == 0) {
           System.out.println("The number is even!");
       } else {
           System.out.println("The number is odd");
       }
        
    }
    
}
