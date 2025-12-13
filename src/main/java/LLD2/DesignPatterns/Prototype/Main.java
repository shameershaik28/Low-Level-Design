package LLD2.DesignPatterns.Prototype;

public class Main {
    public static void main(String[] args) {

        Student original = new Student("Shameer", 29);

        Student copy1 = (Student) original.clone();
        Student copy2 = (Student) original.clone();

        System.out.println(original);
        System.out.println(copy1);
        System.out.println(copy2);
    }
}

