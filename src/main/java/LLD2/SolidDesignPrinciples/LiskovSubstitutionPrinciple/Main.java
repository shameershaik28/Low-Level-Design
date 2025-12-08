package LLD2.SolidDesignPrinciples.LiskovSubstitutionPrinciple;

public class Main {
    public static void main(String[] args) {
        Bird b1 = new Sparrow();
        b1.eat();   // OK

        Bird b2 = new Penguin();
        b2.eat();   // OK

        FlyingBird fb = new Sparrow();
        fb.fly();   // OK

    }
}
