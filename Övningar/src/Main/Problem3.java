
package Main;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the first number:");
        int number1 = sc.nextInt();
        System.out.println("Input the second number:");
        int number2 = sc.nextInt();
        if(number1>number2){
            System.out.println("Result: "+number1);
        } else if(number2>number1){
            System.out.println("Result: "+number2);
        } else if(number1==number2){
            System.out.println("Result: 0");
        } else if(number1%6==number2%6) {
            System.out.println("hej");
        }
        
    }
}
