


package Main;

import java.util.Scanner;

public class Problem3del3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number:");
        int num1 = sc.nextInt();
        System.out.println("Input second number:");
        int num2 = sc.nextInt();
        int quote= num1/num2;
        int mod = quote*num2;
        int sum = num1-mod;  
        System.out.println(num1+num2+" = "+sum);
    }

}
