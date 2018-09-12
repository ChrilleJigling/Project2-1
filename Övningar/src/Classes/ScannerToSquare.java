
package Classes;

import java.util.Scanner;

public class ScannerToSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean loop = true;
        int number;
        while (loop) {
            System.out.println("Input a number to square:");
            number = sc.nextInt();
            sc.nextLine();
            System.out.println(number*number);
            System.out.println("Do you want to make another calculation?");
            String answer = sc.nextLine();
            if(answer.equals("yes")) {
            } else if(answer.equals("no")) {
                loop = false;
            }
        } 
    }
 
}
