package Main;

import Classes.Calculation;
import java.util.Scanner;

public class LocalVariables {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
            System.out.println("Please type two numbers:");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            sc.nextLine();
            System.out.println("What kind of calculation do you want to perform?");
            String choice = sc.nextLine();

            if (choice.equals("addition")) {
                double result = Calculation.addition(a, b);
                System.out.println(result);
            } else if (choice.equals("subtraction")) {
                double result = Calculation.subtraction(a, b);
                System.out.println(result);
            } else if (choice.equals("multiply")) {
                double result = Calculation.multiply(a, b);
                System.out.println(result);
            } else if (choice.equals("divide")) {
                double result = Calculation.divide(a, b);
                System.out.println(result);
            }

            System.out.println("Do you want to do another calculation? yes/no");
            String answer = sc.nextLine();
            if (answer.equals("yes")) {

            } else {
                loop = false;
            }

        }

    }
}
