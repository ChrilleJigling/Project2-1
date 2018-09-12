
package Main;

import java.util.Scanner;

public class Problem2nr6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the first number:");
        int number1 = sc.nextInt();
        System.out.println("Input the second number:");
        int number2 = sc.nextInt();
        System.out.println("Input the third number:");
        int number3 = sc.nextInt();
        boolean result;
        
        if((number1%3 == number2%3) || (number2%3 == number3%3) || (number1%3 == number3%3)){
            result = true;
            System.out.println("The result is "+result);
        } else {
            System.out.println("No numbers matched");
        }
    }
}
