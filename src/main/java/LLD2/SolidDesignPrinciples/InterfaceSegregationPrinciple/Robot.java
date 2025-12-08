package LLD2.SolidDesignPrinciples.InterfaceSegregationPrinciple;

//Implement only what is needed
class Robot implements Workable {
    public void work() { System.out.println("Robot working"); }
    // NOT forced to implement eat() or sleep() ✔
}

