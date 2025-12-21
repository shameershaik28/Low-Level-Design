package LLD2.DesignPatterns.CreationalType.AbstractFactory.Example1;

//Step 4: Concrete factories

class WindowsFactory implements GUIFactory {

    public Button createButton() {
        return new WindowsButton();
    }

    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}

