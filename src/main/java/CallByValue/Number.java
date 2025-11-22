package CallByValue;

public class Number {

    //Here x is the copy version, it does not effect the original x in main method
    void change(int x)
    {
        x  = 10;
        System.out.println(x);

    }
}
