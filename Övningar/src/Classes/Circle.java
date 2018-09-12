
package Classes;

public class Circle {
    private double radius;
    
   public Circle(double b) {
    System.out.println("The constructor is now creating a object from this class");
    radius = b;
    }  
   public void setRadius(double b) {
       this.radius = b;
   }
   public void printRadius() {
       System.out.println(this.radius);
   }
   public double getRadius() {
       return this.radius;
   }
}
