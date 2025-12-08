package LLD2.SolidDesignPrinciples.InterfaceSegregationPrinciple;

//Implement only what is needed
class Human implements Workable, Eatable, Sleepable {
    public void work() { System.out.println("Human working"); }
    public void eat()  { System.out.println("Human eating"); }
    public void sleep(){ System.out.println("Human sleeping"); }
}

