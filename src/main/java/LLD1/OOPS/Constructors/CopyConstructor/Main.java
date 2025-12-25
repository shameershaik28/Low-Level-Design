package LLD1.OOPS.Constructors.CopyConstructor;

public class Main {
    public static void main(String[] args) {
        User u1 = new User("Alex", 25);
        User u2 = new User(u1);   // copy constructor

        System.out.println(u1.equals(u2));

    }
}
