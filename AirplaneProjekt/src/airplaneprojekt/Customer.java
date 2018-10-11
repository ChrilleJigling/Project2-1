
package airplaneprojekt;

public class Customer {
    String name;
    String birthDate;
    String food;
    int totalCost;
    int nrCustomer = 0;
    String travelClass;
    
    public Customer(String name, String birthDate, String travelClass) {
        this.name = name;
        this.birthDate = birthDate;
        nrCustomer++;
        this.travelClass = travelClass;
    }
    
           
    
    
}
