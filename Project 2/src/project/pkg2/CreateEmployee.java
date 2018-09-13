package project.pkg2;

import java.util.ArrayList;
import java.util.Scanner;

public class CreateEmployee {

    static ArrayList<Employee> employList2 = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void addEmployee() {
        System.out.println("What title has this employee?\n"
                + "1. Programmer\n"
                + "2. Technichian\n"
                + "3. Manager\n"
                + "4. Secretary\n"
                + "5. Salesman\");"
                + "6. Previous Menu");

        boolean sant = true;
        int choice1 = sc.nextInt();
        sc.nextLine();
        switch (choice1) {

            case 1:
                System.out.println("Enter the name of the employee you want to add: ");
                String name = sc.nextLine();
                System.out.println("Age of the employee: ");
                int age = sc.nextInt();
                sc.nextLine();
                System.out.println("Gender of the employee: ");
                String gender = sc.nextLine();
                System.out.println("Salary of the employee: ");
                double salary = sc.nextDouble();
                Programmer p1 = new Programmer(name, age, salary, gender);
                p1.setTitle("Programmer");
                employList2.add(p1);
                break;
            case 2:
                System.out.println("Enter the name of the employee you want to add: ");
                String name2 = sc.nextLine();
                System.out.println("Age of the employee: ");
                int age2 = sc.nextInt();
                sc.nextLine();
                System.out.println("Gender of the employee: ");
                String gender2 = sc.nextLine();
                System.out.println("Salary of the employee: ");
                double salary2 = sc.nextDouble();
                Technician t1 = new Technician(name2, age2, salary2, gender2);
                t1.setTitle("Tecnician");
                employList2.add(t1);
                break;
            case 3:
                System.out.println("Enter the name of the employee you want to add: ");
                String name3 = sc.nextLine();
                System.out.println("Age of the employee: ");
                int age3 = sc.nextInt();
                sc.nextLine();
                System.out.println("Gender of the employee: ");
                String gender3 = sc.nextLine();
                System.out.println("Salary of the employee: ");
                double salary3 = sc.nextDouble();
                Secretary s1 = new Secretary(name3, age3, salary3, gender3);
                s1.setTitle("Programmer");
                employList2.add(s1);
                break;
            case 4:
                System.out.println("Enter the name of the employee you want to add: ");
                String name4 = sc.nextLine();
                System.out.println("Age of the employee: ");
                int age4 = sc.nextInt();
                sc.nextLine();
                System.out.println("Gender of the employee: ");
                String gender4 = sc.nextLine();
                System.out.println("Salary of the employee: ");
                double salary4 = sc.nextDouble();
                Salesman sale1 = new Salesman(name4, age4, salary4, gender4);
                sale1.setTitle("Salesman");
                employList2.add(sale1);
                break;

            case 6:
                sant = false;
                break;

            default:
                System.out.println("Wrong choice.");
                break;

        }

    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
