package LLD1.OOPS.Constructors.ConstructorOverloading;

class User {
    String name;
    int age;

    User() {
        this.name = "Unknown";
        this.age = 0;
    }

    User(String name) {
        this.name = name;
        this.age = 0;
    }

    User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

