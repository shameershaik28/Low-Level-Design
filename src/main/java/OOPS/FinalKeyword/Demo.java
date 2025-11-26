package OOPS.FinalKeyword;

class Demo {
   final int value = 10;        // final variable (cannot change)

    void show() {          // final method (cannot override)
        System.out.println("Value = " + value);
    }
}

