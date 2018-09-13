package arraykrud;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonManagement {

    static ArrayList<Person> arr = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void addPerson() {
        System.out.print("Person name: ");
        String name = sc.nextLine();
        System.out.print("Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        Person p1 = new Person("Chrille", 23);
        arr.add(p1);
    }

    public static void removePersonByID() {
        System.out.print("ID on the person you want to remove: ");
        int personID = sc.nextInt();
        sc.nextLine();
        for (Person person : arr) {
            if (person.getId() == personID) {
                arr.remove(person);
            }
        }
    }
    public static void removePersonByName() {
        System.out.print("Name on the person you want to remove: ");
        String name = sc.nextLine();
        for (Person person : arr) {
            if(person.getName().equalsIgnoreCase(name)) {
               arr.remove(person);
        }
            
        }
    }
    public static int nrOfPersons() {
        return arr.size();
    }
    public static void updatePersonNameByID() {
        System.out.println("ID on person you want to update: ");
        int personID = sc.nextInt();
        sc.nextLine();
        for (Person person : arr) {
            if(person.getId()==personID) {
                System.out.println("What name do you want to give this person? ");
                person.setName(sc.nextLine());
            }
        } 
    }
    
    public static void printAll() {
        System.out.println(arr);
    }
    public static void printPerson() {
        System.out.println("ID: ");
        int personID = sc.nextInt();
        sc.nextLine();
        for (Person person : arr) {
            if(person.getId()==personID) {
                System.out.println(person);
            }
        }
    }
    public static void updatePersonAgeByID() {
        System.out.println("ID on person you want to update: ");
        int personID = sc.nextInt();
        sc.nextLine();
        for (Person person : arr) {
            if(person.getId()==personID) {
                System.out.println("What age do you want to give this person? ");
                person.setAge(sc.nextInt());
            }
        } 
    }
}
