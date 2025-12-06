package LLD1.OOPS.Access_Modifiers;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("shameer", 28000, 29, "Concentrix");
        System.out.println(e1.name);
        System.out.println(e1.age);
        System.out.println(e1.company);
        System.out.println(e1.getSalary());
        System.out.println(e1.setSalary(50000));
        System.out.println(e1.getSalary());
        e1.displayInfo();
    }
}
