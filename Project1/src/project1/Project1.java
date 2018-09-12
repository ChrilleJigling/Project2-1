package project1;

import java.util.Scanner;

public class Project1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean loop = true;

        while (loop) {
            System.out.println("What figure do you want to create?");
            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase("circle")) {
                System.out.println("Insert preferred radius:");
                Circle c = new Circle(sc.nextDouble());
                sc.nextLine();
                System.out.println("Do you want to calculate the area, the circumference or both?");
                choice = sc.nextLine();

                if (choice.equalsIgnoreCase("area")) {
                    System.out.println("The area is: " + c.getArea());
                } else if (choice.equalsIgnoreCase("circumference")) {
                    System.out.println("The circumference is: " + c.getCircumference());
                } else if (choice.equalsIgnoreCase("both")) {
                    System.out.println("The area is: " + c.getArea());
                    System.out.println("The circumference is: " + c.getCircumference());
                }
            } else if (choice.equalsIgnoreCase("rectangle")) {
                System.out.println("Insert preferred heigth & base:");
                Rectangle r = new Rectangle(sc.nextDouble(), sc.nextDouble());
                sc.nextLine();
                System.out.println("Do you want to calculate the area, the circumference or both?");
                String choice2 = sc.nextLine();
                if (choice2.equalsIgnoreCase("area")) {
                    System.out.println("The area is: " + r.getArea());
                } else if (choice2.equalsIgnoreCase("circumference")) {
                    System.out.println("The circumference is: " + r.getCircumference());
                } else if (choice2.equalsIgnoreCase("both")) {
                    System.out.println("The area is: " + r.getArea());
                    System.out.println("The circumference is: " + r.getCircumference());
                }
            } else if (choice.equalsIgnoreCase("Triangle")) {
                System.out.println("Do you want to insert base and height press 1, if you want to insert the length of the three sides, press 2");
                int choice1 = sc.nextInt();
                sc.nextLine();
                if (choice1 == 1) {
                    System.out.println("Insert first the base and then the height:");
                    double base = sc.nextDouble();
                    double height = sc.nextDouble();
                    sc.nextLine();
                    Triangle t1 = new Triangle(base, height);
                    System.out.println("Do you want to calculate the area, circumference or both?");
                    choice = sc.nextLine();
                    if (choice.equalsIgnoreCase("area")) {
                        System.out.println("Area of Triangle is: " + t1.getArea());
                    } else if (choice.equalsIgnoreCase("circumference")) {
                        System.out.println("Unfortunatley I can't calculate the circumferenece of the Triangle with only a base and height.");
                    } else if (choice.equalsIgnoreCase("both")) {
                        System.out.println("Area of Triangle is: " + t1.getArea());
                        System.out.println("Unfortunatley I can't calculate the circumferenece of the Triangle with only a base and height.");
                    }
                } else if (choice1 == 2) {
                    System.out.println("Insert the length of the three sides:");
                    double sideA = sc.nextDouble();
                    double sideB = sc.nextDouble();
                    double sideC = sc.nextDouble();
                    sc.nextLine();
                    Triangle t1 = new Triangle(sideA, sideB, sideC);
                    System.out.println("Do you want to calculate the area, circumference or both?");
                    choice = sc.nextLine();
                    if (choice.equalsIgnoreCase("area")) {
                        System.out.println("Area of Triangle is: " + t1.getArea());
                    } else if (choice.equalsIgnoreCase("circumference")) {
                        System.out.println("Circumference of Triangle is: " + t1.getCircumference());
                    } else if (choice.equalsIgnoreCase("both")) {
                        System.out.println("Area of Triangle is: " + t1.getArea());
                        System.out.println("Circumference of Triangle is: " + t1.getCircumference());
                    }
                }

            }
            System.out.println("Do you want to make another calculation? yes/no");
            String loopAgain = sc.nextLine();
            if (loopAgain.equalsIgnoreCase("yes")) {

            } else {
                loop = false;
            }
        }

    }
}
