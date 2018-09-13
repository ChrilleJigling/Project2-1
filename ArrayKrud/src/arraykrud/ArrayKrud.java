
package arraykrud;

import java.util.Scanner;

public class ArrayKrud {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
     switchChoice(menu());
        
        
        
    }
    public static int menu() {
        System.out.println("1. Add person");
        System.out.println("2. Remove person by ID");
        System.out.println("2. Remove person by name");
        System.out.println("3. Print person");
        System.out.println("4. Print all persons");
        System.out.println("5. Update person");
        System.out.println("6. Print number of persons");
        int choice = PersonManagement.sc.nextInt();
        PersonManagement.sc.nextLine();
        return choice;
    }
    public void switchChoice(int choice) {
        
    }
}
