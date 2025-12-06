package LLD1.OOPS.CallByValue;

public class Main {
    public static void main(String[] args) {
        int x = 5;
        Number n1 = new Number();
        n1.change(x);


        System.out.println(x);
    }
}
