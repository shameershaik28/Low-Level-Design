package LLD2.DesignPatterns.CreationalType.Factory.Example1;

//Step 2: Concrete implementations
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}
