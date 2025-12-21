package LLD2.DesignPatterns.CreationalType.AbstractFactory.Example1;

//Step 5: Client code (MAIN)4

public class Main {
    public static void main(String[] args) {

        GUIFactory factory;

        factory = new WindowsFactory();
        factory.createButton().paint();
        factory.createCheckbox().paint();

        factory = new MacFactory();
        factory.createButton().paint();
        factory.createCheckbox().paint();
    }
}

