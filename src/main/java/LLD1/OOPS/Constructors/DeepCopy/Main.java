package LLD1.OOPS.Constructors.DeepCopy;

public class Main {
    public static void main(String[] args) {
        Location a1 = new Location("Mumbai");
        Teacher t1 = new Teacher("Rahul", 20, a1);
        Teacher t2 = new Teacher(t1);

        System.out.println(t1.name + " " + t1.age + " " +  t1.location.cityName);
        System.out.println(t2.name + " " + t2.age + " " + t2.location.cityName);

        System.out.println();

        System.out.println(t1.equals(t2));
        t2.location.cityName = "Hyderabad";

        System.out.println(t1.name + " " + t1.age + " " + t1.location.cityName);
        System.out.println(t2.name + " " + t2.age + " " +  t2.location.cityName);

    }
}
