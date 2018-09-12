package Main;

import java.util.Scanner;

public class Problemdel1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number:");
        int number1 = sc.nextInt();
        System.out.println("Input second number:");
        int number2 = sc.nextInt();

        if (number1 % 6 == number2 % 6) {
            if (number1 > number2) {
                System.out.println(number2);
            } else if (number2 > number1) {
                System.out.println(number1);
            }
        } else if (number1 > number2) {
            System.out.println("The larger number is: " + number1);
        } else if (number2 > number1) {
            System.out.println("The larger number is: " + number2);
        } else if (number1 == number2) {
            System.out.println("0");
        }

    }

}
