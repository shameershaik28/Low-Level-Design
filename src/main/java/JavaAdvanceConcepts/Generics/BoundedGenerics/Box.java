package JavaAdvanceConcepts.Generics.BoundedGenerics;

import java.util.List;

class Box<T extends Number> {
    T value;

    Box(T value) {
        this.value = value;
    }

    //Upper Bound
    void show() {
        System.out.println(value);

    }

    //Lower Bound
    public static void addNumbers(List<? super Integer> list) {
        list.add(10);
        list.add(20);

        System.out.println(list);
    }



}

