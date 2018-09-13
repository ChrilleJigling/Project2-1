package project.pkg2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Employee> employList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menu1();
        while (true) {
            
            int choice = sc.nextInt();
            
            switch (choice) {

                case 1:
                    CreateEmployee.addEmployee();
                    break;

                case 2:

                    break;

                case 3:
                    menu1();
                    break;
                case 4: 
                    System.exit(0);
                    break;

                default:
                    System.out.println("Wrong sucka!");

            }
        }

    }

    public static void menu1() {
        System.out.println("Welcome to the employee program\n"
                + "1. Employee management\n"
                + "2. Employee statistics\n"
                + "3. Present menu\n"
                + "4. Exit");

    }
}
