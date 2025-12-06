package LLD1.OOPS.ObjectClass;

public class Demo {
    public static void main(String[] args) {
        Person p = new Person("Alice");
        System.out.println(p.toString()); // from Object class



        Object obj = new String("Hello");
        System.out.println(obj.getClass());


    }
}
