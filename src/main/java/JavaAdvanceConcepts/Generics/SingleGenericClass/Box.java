package JavaAdvanceConcepts.Generics.SingleGenericClass;

class Box<T> {      // <T> → Type parameter
    T value;

    Box(T value) {
        this.value = value;
    }

    T getValue() {
        return value;
    }
}

