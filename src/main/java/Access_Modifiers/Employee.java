package Access_Modifiers;


public class Employee {
    public String name;
    private int salary;
    int age;
    protected String company;


    public Employee(String name, int salary, int age, String company) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.company = company;
    }

    public int setSalary(int salary) {
        this.salary = salary;
        return salary;
    }

    public int getSalary() {
        return salary;
    }


    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);
        System.out.println("Company: " + company);
    }
}
