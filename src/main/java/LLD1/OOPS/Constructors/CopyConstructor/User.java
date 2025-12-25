package LLD1.OOPS.Constructors.CopyConstructor;

class User {
    String name;
    int age;

    // Normal constructor
    User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    User(User other) {
        this.name = other.name;
        this.age = other.age;
    }
}

