package LLD1.OOPS.Interface.MultipleInheritance;

public interface A {

    default void show(){
        System.out.println("A show");
    }

    static void show2(){
        System.out.println("A show2");
    }
}
