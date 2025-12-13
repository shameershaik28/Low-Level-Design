package LLD1.OOPS.toStringMethod;

public class Main {
    public static void main(String[] args) {

        Person p = new Person("John", 25);

        System.out.println(p);              // automatically calls toString()
        System.out.println(p.toString());   // same as above
    }
}

