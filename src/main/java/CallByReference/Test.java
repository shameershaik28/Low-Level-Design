package CallByReference;

public class Test {

    public static void modify(Student s) {
        s.age = 30;      // modifying the object
    }

    public static void main(String[] args) {
        Student st = new Student();
        st.age = 10;

        modify(st);
        System.out.println(st.age); // Output: 30
    }
}

