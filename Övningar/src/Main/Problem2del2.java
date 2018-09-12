
package Main;

import java.util.Scanner;


public class Problem2del2 {
    //Problem 2 #4
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the first number:");
        int number1 = sc.nextInt();
        System.out.println("Input the second number:");
        int number2 = sc.nextInt();
        System.out.println("Input the third number:");
        int number3 = sc.nextInt();
        if(number2>number1&&number3>number2){
            System.out.println("The result is: "+true);
        } else {
            System.out.println("The result is: "+false);
        }
        
        
    }
}
