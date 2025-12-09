package LLD2.DesignPatterns.Singleton.BillPughSingleton;

public class Main {
    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2);

        s1.showMessage();

        System.out.println(s1);
        System.out.println(s2);
    }
}

