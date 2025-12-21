package LLD2.DesignPatterns.CreationalType.AbstractFactory.Example1;

//Step 2: Concrete products
class MacCheckbox implements Checkbox {
    public void paint() {
        System.out.println("Mac Checkbox");
    }
}