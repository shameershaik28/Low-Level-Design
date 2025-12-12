package LLD2.DesignPatterns.Builder;

public class Main {
    public static void main(String[] args) {

        User user = User.getBuilder()
                .name("John")
                .age(17)
                .email("john@gmail.com")
                .phone("99999")
                .build();

        System.out.println(user);
    }
}

