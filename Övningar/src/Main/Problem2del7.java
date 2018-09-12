


package Main;

import java.util.Scanner;

public class Problem2del7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input seconds");
        long seconds = sc.nextLong();
        long minutes = seconds/60;
        long hours = minutes/60;
        
        System.out.println("Hours: "+hours%24+" Minutes: "+minutes%60+" Seconds: "+seconds%60);
        
       
    }

}
