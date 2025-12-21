package LLD2.DesignPatterns.CreationalType.AbstractFactory.Example1;

//Step 4: Concrete factories

class MacFactory implements GUIFactory {

    public Button createButton() {
        return new MacButton();
    }

    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}

