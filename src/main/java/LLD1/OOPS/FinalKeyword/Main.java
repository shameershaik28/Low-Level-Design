package LLD1.OOPS.FinalKeyword;

public class Main {
    public static void main(String[] args) {
        Demo d = new Demo();
        //d.value = 20;  // ❌ Error: cannot reassign final variable
        d.show();
    }
}
