
package arraykrud;
import java.util.Scanner;

public class Person {
    Scanner sc = new Scanner(System.in);
    private String name;
    private int age;
    private int id;
    int idGenerator = 1;
    
    public Person(String name, int age) {
        this.id=idGenerator;
        this.name = name;
        this.age = age;
        idGenerator++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Override
    public String toString() {
        return "Name: "+name+"ID: "+id+"Age: "+age;
    }
}
