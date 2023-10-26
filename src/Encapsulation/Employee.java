package Encapsulation;

public class Employee extends Person {
    private int salary;

    Employee(String firstName, String lastName, Byte age, Integer ssn, int salary) {
        super(firstName, lastName, age, ssn);
        this.salary = salary;
    }

    public String speak() {
        return "My name is " + getFirstName() + " " + getLastName() + ". My salary is $" + salary + ".";
    }
    
    public static void main(String[] args) {
        var p1 = new Employee("John", "Marshall", (byte) 32, 123456789, 80000);
        System.out.println(p1.speak());
    }
}
