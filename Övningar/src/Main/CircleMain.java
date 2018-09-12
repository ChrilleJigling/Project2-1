package Main;
import Classes.Circle;   
import Classes.Person;
public class CircleMain {
    
    public static void main(String[] args) {
        
        Circle cr1 = new Circle(75);
        cr1.setRadius(35.7);
        double radius = cr1.getRadius();
        System.out.println(radius);
       
        Person p1 = new Person("Chrille", "30/12/1994", "Huddinge Sjukhus", "Student");
        p1.setName("Johan");
        p1.printPerson();
    }
}
