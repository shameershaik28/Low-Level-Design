package LLD1.OOPS.Interface.MultipleInheritance;

public class Main {
    public static void main(String[] args) {
         C obj = new C();
         obj.show();
         //Calling static method from A interface - Java 8+
         A.show2();


         A a = new C();
         a.show();
    }
}
