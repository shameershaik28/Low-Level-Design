package OOPS.Constructors.ShallowCopy;

public class Main {
    public static void main(String[] args) {
        Address a1 = new Address("Mumbai");
        Student s1 = new Student("shameer", 20, a1);
        Student s2 = new Student(s1); // shallow copy

        s2.address.city = "Hyderabad";

        System.out.println(s1.name + " " + s1.age + " " + s1.address.city);
        System.out.println(s2.name + " " + s2.age + " " + s2.address.city);

    }
}
