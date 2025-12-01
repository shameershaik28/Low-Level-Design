package OOPS.AnonymousClass.UsingAnAbstractClass;

abstract class Shape {
    abstract void draw();
}

public class Demo2 {
    public static void main(String[] args) {

        Shape circle = new Shape() {
            @Override
            void draw() {
                System.out.println("Drawing Circle");
            }
        };

        circle.draw();
    }
}

