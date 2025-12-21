package LLD2.DesignPatterns.CreationalType.Singleton.EnumSingleton;

public class Main {
    public static void main(String[] args) {

        Singleton s1 = Singleton.INSTANCE;
        Singleton s2 = Singleton.INSTANCE;
        System.out.println(s1 == s2);

        s1.showMessage();

        System.out.println(s1);
        System.out.println(s2);
    }
}

