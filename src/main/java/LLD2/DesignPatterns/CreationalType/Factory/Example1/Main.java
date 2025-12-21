package LLD2.DesignPatterns.CreationalType.Factory.Example1;

//Step 4: Client code (MAIN)

public class Main {
    public static void main(String[] args) {

        Shape s1 = ShapeFactory.getShape("circle");
        s1.draw();

        Shape s2 = ShapeFactory.getShape("rectangle");
        s2.draw();
    }
}

