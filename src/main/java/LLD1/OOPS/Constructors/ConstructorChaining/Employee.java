package LLD1.OOPS.Constructors.ConstructorChaining;

class Employee extends Person {
    String department;

    // Child default constructor
    Employee() {
        this("No Department"); // calling another constructor in same class
        System.out.println("Child: Default constructor called");
    }

    // Child parameterized constructor
    Employee(String department) {
        super("John", 25); // calls parent constructor
        this.department = department;
        System.out.println("Child: Parameterized constructor called");
    }
}
