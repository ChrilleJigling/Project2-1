
package project.pkg2;

import java.util.ArrayList;

public abstract class Employee {
    
    private String name;
    private int age;
    private double salary;
    private String title;
    private String gender;
    private int id;
    private double bonus;
    private int nrOfIDs;
    
    public Employee(String name, int age,double salary, String gender) {
        this.id = nrOfIDs;
        id++;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
        
        
   
    }

    
    
    
    
    
    
    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGender() {
        return gender;
    }

    public int getId() {
        return id;
    }
    public abstract String toString();
}
