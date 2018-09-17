package project.pkg2.Employees;

import project.pkg2.Employees.Proffesions.*;
import project.pkg2.Utilitis.Gender;
import project.pkg2.Utilitis.Title;

import java.util.ArrayList;
import project.pkg2.UI.Main;

import static project.pkg2.UI.Main.sc;

public class EmployeeList extends Employee {

    public static ArrayList<Employee> employList = new ArrayList<>();

    public EmployeeList(String name, int age, Gender gender, Title title, double salary, double bonus) {
        super(name, age, gender, title, salary, bonus);
    }


    public static void addEmployee() {

        boolean done = false;
        while (done == false) {

            System.out.println("What name has this employee?");
            String name = sc.nextLine();

            System.out.println("Age of the employee: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.println("Please state the gender of the employee : \n"
                    + "[1] for male.\n"
                    + "[2] for female.\n"
                    + "or [3] for unspecified. ");
            Gender gender = null;
            int choiceGender = sc.nextInt();
            sc.nextLine();
            switch (choiceGender) {
                case 1:
                    gender = Gender.MALE;
                    break;
                case 2:
                    gender = Gender.FEMALE;
                    break;
                case 3:
                    gender = Gender.OTHER;
                    break;
                default:
                    System.out.println("Sorry, unrecognized option.");
            }
            System.out.println("What title has this employee?\n"
                    + "1. Programmer\n"
                    + "2. Technichian\n"
                    + "3. Secretary\n"
                    + "4. Salesman\n"
                    + "5. Previous Menu");


            int choiceProfession = sc.nextInt();
            sc.nextLine();
            double salary = 0;
            double bonus = 0;
            Title titles = null;
            switch (choiceProfession) {
                case 1:
                    titles = Title.PROGRAMMER;
                    Programmer programmer = new Programmer(name,age,gender,titles,salary,bonus);
                    System.out.println("Enter the salary of the employee: ");
                    programmer.setSalary(sc.nextDouble());
                    salary = programmer.getSalary();
                    System.out.println("Enter the the bonus for the employee: ");
                    bonus = sc.nextDouble();
                    programmer.setBonus(bonus);
                    break;
                case 2:
                    titles = Title.TECHNICIAN;
                    Technician technician = new Technician(name,age,gender,titles,salary,bonus);
                    System.out.println("Enter the salary of the employee: ");
                    salary = sc.nextDouble();
                    technician.setSalary(salary);
                    System.out.println("Enter the the bonus for the employee: ");
                    bonus = sc.nextDouble();
                    technician.setBonus(bonus);
                    break;
                case 3:
                    titles = Title.SECRETARY;
                    Secretary secretary = new Secretary(name,age,gender,titles,salary,bonus);
                    System.out.println("Enter the salary of the employee: ");
                    salary = sc.nextDouble();
                    secretary.setSalary(salary);
                    System.out.println("Enter the the bonus for the employee: ");
                    bonus = sc.nextDouble();
                    secretary.setBonus(bonus);
                    break;
                case 4:
                    titles = Title.SALESMAN;
                    Salesman salesman = new Salesman(name,age,gender,titles,salary,bonus);
                    System.out.println("Enter the salary of the employee: ");
                    salary = sc.nextDouble();
                    salesman.setSalary(salary);
                    System.out.println("Enter the the bonus for the employee: ");
                    bonus = sc.nextDouble();
                    salesman.setBonus(bonus);
                    break;
                default:
                    System.out.println("Sorry unrecognized option");
            }

            Employee employee = new Employee(name, age, gender,titles,salary,bonus) {
            };
            System.out.println("Do you want to add this employee:"
                    + "\nName: " + employee.getName()
                    + "\nAge: " + employee.getAge()
                    + "\nGender: " + employee.getGender()
                    + "\nWith this roll:"
                    + "\nTitel: " + employee.getTitle()
                    + "\nSalary: " + employee.getSalary() + " kr/month"
                    + "\nBonus: " + employee.getBonus() + " % and that is in kronor: "+ employee.calcBonus(employee.getSalary())
                    + "\n"
                    + "\n[1]Yes | [2] No, I want to redo it");
            int choiceDone = sc.nextInt();
            switch (choiceDone) {
                case 1:

                    EmployeeList.employList.add(employee);
                    System.out.println("Employee created with the ID-number: "+ Employee.getID()+". returning to previous menu.");
                    EmployeeManagement.menu2();
                    break;
                case 2:

                default:
                    System.out.println("Something wrong at the end of employee management");
            }
        }
        EmployeeManagement.menu2();
    }

    public static void deleteMenu() {
        System.out.println("1. Delete employee by name\n"
                + "2. Delete employee by ID\n"
                + "0. Back to main menu");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                deleteEmployeeByName();
                break;
            case 2:
                deleteEmployeeByID();
                break;
            case 0:
                Main.menu1();
            default:
                System.out.println("Try again!");
        }
    }

    public static void deleteEmployeeByName() {
        boolean done = false;
        System.out.println("Enter name on person you want to delete: ");
        while (done == false) {
            String name = sc.nextLine();
            for (Employee employee : employList) {
                if (employee.getName().equalsIgnoreCase(name)) {
                    System.out.println("New name on employee: ");
                    String newName = sc.nextLine();
                    System.out.println("Do you want to set this employees name to: " + newName);
                    System.out.println("[1] Yes / [2] No, i want to redo it.");
                    int choice = sc.nextInt();
                    sc.nextLine();
                    switch (choice) {
                        case 1:
                            employee.setName(newName);
                            System.out.println("The name has been updated");
                            done = true;
                            break;
                        case 2:
                            System.out.println("Enter name on person you want to delete: ");
                            break;
                        default:
                            System.out.println("ERROR");
                    }
                }
            }
        }
        EmployeeManagement.menu2();
    }

    public static void deleteEmployeeByID() {
        boolean done = false;
        System.out.println("Enter ID on person you want to delete: ");
        while (done == false) {
            int personID = sc.nextInt();
            sc.nextLine();
            for (Employee employee : employList) {
                if (employee.getID() == personID) {
                    System.out.println("Do you want to delete this employee: " + employee);
                    System.out.println("[1] Yes / [2] No, wrong employee");
                    int choice = sc.nextInt();
                    sc.nextLine();
                    switch (choice) {
                        case 1:
                            employList.remove(employee);
                            System.out.println("The employee has been removed");
                            done = true;
                            break;
                        case 2:
                            System.out.println("Enter ID on person you want to delete: ");
                            break;
                        default:
                            System.out.println("ERROR");
                    }
                }
            }
        }
        EmployeeManagement.menu2();
    }

    public static void updateNameOnEmployee() {
        boolean done = false;
        System.out.println("ID on person you want to update: ");
        while (done == false) {
            int personID = sc.nextInt();
            sc.nextLine();
            for (Employee employee : employList) {
                if (employee.getID() == personID) {
                    System.out.println("New name on employee: ");
                    String newName = sc.nextLine();
                    System.out.println("Do you want to set this employees name to:" + newName);
                    System.out.println("[1] Yes / [2] No, i want to redo it.");
                    int choice = sc.nextInt();
                    sc.nextLine();
                    switch (choice) {
                        case 1:
                            employee.setName(newName);
                            System.out.println("The name has been updated");
                            break;
                        case 2:
                            System.out.println("ID on person you want to update: ");
                            break;
                        default:
                            System.out.println("ERROR");
                    }
                }
            }
        }
        EmployeeManagement.menu2();
    }

    public static void updateAgeOnEmployee() {
        boolean done = false;
        System.out.println("ID on person you want to update: ");
        while (done == false) {
            int personID = sc.nextInt();
            sc.nextLine();
            for (Employee employee : employList) {
                if (employee.getID() == personID) {
                    System.out.println("New age on employee: ");
                    int newAge = sc.nextInt();
                    System.out.println("Do you want to set this employees age to:" + newAge);
                    System.out.println("[1] Yes / [2] No, i want to redo it.");
                    int choice = sc.nextInt();
                    sc.nextLine();
                    switch (choice) {
                        case 1:
                            employee.setAge(newAge);
                            System.out.println("The age has been updated");
                            break;
                        case 2:
                            System.out.println("ID on person you want to update: ");
                            break;
                        default:
                            System.out.println("ERROR");
                    }
                }
            }
        }
        EmployeeManagement.menu2();
    }

    public static void updateDepartmentOfEmployee() {
        boolean done = false;
        System.out.println("Enter name on person you want to update: ");
        while (done == false) {
            Title titles = null;
            String name = sc.nextLine();
            sc.nextLine();
            for (Employee employee : employList) {
                if (employee.getName().equalsIgnoreCase(name)) {
                    System.out.println("Enter department to transfer employee to: ");
                    String newDepartment = sc.nextLine();
                    System.out.println("Do you want to set this employees department to:" + newDepartment);
                    System.out.println("[1] Yes / [2] No, i want to redo it.");
                    int choice = sc.nextInt();
                    sc.nextLine();
                    switch (choice) {
                        case 1:
                            if (newDepartment.equalsIgnoreCase("Programmer")) {
                                titles = Title.PROGRAMMER;
                                System.out.println("The department has been updated");
                                break;
                            } else if (newDepartment.equalsIgnoreCase("Technician")) {
                                titles = Title.TECHNICIAN;
                                System.out.println("The department has been updated");
                                break;
                            } else if (newDepartment.equalsIgnoreCase("Salesman")) {
                                titles = Title.SALESMAN;
                                System.out.println("The department has been updated");
                                break;
                            } else if (newDepartment.equalsIgnoreCase("Secretary")) {
                                titles = Title.SECRETARY;
                                System.out.println("The department has been updated");
                                break;
                            }

                        case 2:
                            System.out.println("Enter name on person you want to update: ");
                            break;
                        default:
                            System.out.println("ERROR");
                    }
                }
            }
        }
        EmployeeManagement.menu2();
    }

    public static void printAllEmployees() {
        for (Employee employee : employList) {
            System.out.println(employee);
        }
    }
}