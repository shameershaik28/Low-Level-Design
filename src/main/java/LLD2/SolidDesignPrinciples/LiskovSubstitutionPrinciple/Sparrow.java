package LLD2.SolidDesignPrinciples.LiskovSubstitutionPrinciple;

class Sparrow extends FlyingBird {
    @Override
    void fly() {
        System.out.println("Sparrow is flying");
    }
}

