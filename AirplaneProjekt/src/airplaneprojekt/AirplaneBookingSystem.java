
package airplaneprojekt;
import static airplaneprojekt.Airplane.airplaneSeats;
import java.util.HashMap;
import java.util.Scanner;

public class AirplaneBookingSystem {
    static Scanner sc = new Scanner(System.in);
    
    public static void menu() {
        System.out.println("Welcome to definitely not SAS booking system");
        System.out.println("1. Book a seat"
                + "2. Admin settings");
        String choice = sc.nextLine();
        
        switch(choice) {
            case "1":
                System.out.println("Enter name on passenger:");
                String name = sc.nextLine();
                System.out.println("Enter birthdate: YYYYMMDD ");
                String birthdate = sc.nextLine();
                System.out.println("Do you wish to travel"
                        + "1. first class"
                        + "2. business class?");
                String travelClass = sc.nextLine();
                Customer c1 = new Customer(name, birthdate, travelClass);
                System.out.println("Do you want food on the plane? yes/no");
                String foodChoice = sc.nextLine();
                switch(travelClass){
                    case"1":
                        for (int i = 1; i <= 5; i++) {
                            if(!airplaneSeats.containsKey(i)) {
                                airplaneSeats.put(i, c1);
                                break;
                            }
                            
                        }

                       if(foodChoice.equalsIgnoreCase("yes")) {
                         firstClassFoodMenu();  
                       }
                          
                       
                       
                        break;
                    case"2":
                        break;
                }
                break;
                
                
            case "2":
                break;
            default:
        
            
    }
    
}
}