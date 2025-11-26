package OOPS.ClassAndObject;

public class Student {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void displayInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
