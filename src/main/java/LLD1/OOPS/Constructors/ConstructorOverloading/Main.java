package LLD1.OOPS.Constructors.ConstructorOverloading;

public class Main {
    public static void main(String[] args) {
        User u = new User();
        System.out.println(u.age + " " + u.name);
        User u2 = new User("shameer");
        System.out.println(u2.age + " " + u2.name);
        User u3 = new User("Alex", 25);
        System.out.println(u3.age + " " + u3.name);
    }
}
