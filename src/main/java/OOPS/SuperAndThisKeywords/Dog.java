package OOPS.SuperAndThisKeywords;

class Dog extends Animal {
    String type = "Dog";

    Dog() {
        super(); // calls parent constructor
        System.out.println("Dog constructor");
    }

    void printTypes() {
        System.out.println(super.type); // accesses parent variable
        System.out.println(this.type);  // child's variable
    }

    void sound() {
        super.sound(); // calls parent method
        System.out.println("Dog barks");
    }
}
