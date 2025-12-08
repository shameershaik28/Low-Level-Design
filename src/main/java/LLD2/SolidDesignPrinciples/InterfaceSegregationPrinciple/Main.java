package LLD2.SolidDesignPrinciples.InterfaceSegregationPrinciple;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.eat();
        human.sleep();
        human.work();

        Robot robot = new Robot();
        robot.work();
       // robot.eat();  Won't work
      // robot.sleep(); Won't work
    }
}
