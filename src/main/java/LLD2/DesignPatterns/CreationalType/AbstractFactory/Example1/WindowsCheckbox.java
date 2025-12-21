package LLD2.DesignPatterns.CreationalType.AbstractFactory.Example1;

//Step 2: Concrete products
class WindowsCheckbox implements Checkbox {
    public void paint() {
        System.out.println("Windows Checkbox");
    }
}
