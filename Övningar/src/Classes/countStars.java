
package Classes;

import java.util.Scanner;


public class countStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean loop = true;
        int printRequests = 1;
        while (loop) {
         System.out.println("how many stars do you want to print?");
         int nrOfStars = sc.nextInt();
         sc.nextLine();
        for(int i=1; i<=nrOfStars; i++) {
            System.out.print("*");    
         
        }
        System.out.println();
        System.out.println("Do you want to print more stars?");
        String answer = sc.nextLine();
        if(answer.equals("y")) {
           printRequests ++;
        } else {
            loop = false;
            System.out.println("You made "+printRequests+" print requests");
        } 
            
        } 
    }
}
