package OOPS.Constructors.DeepCopy;

public class Teacher {
    String name;
    int age;
    Location location;  // non-primitive

    public Teacher(String name, int age, Location location) {
        this.name = name;
        this.age = age;
        this.location = location;
    }

    // Deep copy constructor
    public Teacher(Teacher other) {
        this.name = other.name;
        this.age = other.age;

        // Create NEW location object
        this.location = new Location(other.location.cityName);
    }
}

