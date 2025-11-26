package OOPS.Constructors;

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Hyundai", "Black", 2025 );
        Student s1 = new Student();
        Animal a1 = new Animal();



        //Print the info
        v1.display();

        s1.id = 02;
        s1.name = "shameer";

        System.out.println(s1.id + " " + s1.name);

        System.out.println(a1.age + " " + a1.name);
    }
}
