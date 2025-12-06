package LLD1.OOPS.FinalKeyword;

final class Demo {
   final int value = 10;        // final variable (cannot change)

    final void show() {          // final method (cannot override)
        System.out.println("Value = " + value);
    }
}

