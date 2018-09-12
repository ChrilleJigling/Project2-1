


package Main;

import java.util.Scanner;

public class Array2 {
    
    static Scanner sc = new Scanner(System.in);
    static int[] numbers;
    static int sum;
    static double average;

    public static void main(String[] args) {
        
        createTheArray();
        fillArray();
        printArray();
        calculateSum();
        calculateAverage();
        printArraySize();
       
        }

    
    private static void createTheArray() {
        System.out.println("How many numbers you want to input in your array?");
        numbers = new int[sc.nextInt()];
    }
    private static void printArraySize() {
        System.out.println("The size of the array is: "+numbers.length);
            
    }
    private static void fillArray() {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Input number: "+(i+1));
            numbers[i] = sc.nextInt();
        }
    }
    private static void calculateSum() {
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            
        }
        System.out.println("The sum of the array is: "+sum);
    }
    private static void calculateAverage() {
        for (int i = 0; i < numbers.length; i++) {
             average += numbers[i];
        }
        System.out.println("The average of this array is: "+average/numbers.length);
    }
    private static void printArray() {
        System.out.println("The numbers in the array are: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);     
        }
    }
    }

