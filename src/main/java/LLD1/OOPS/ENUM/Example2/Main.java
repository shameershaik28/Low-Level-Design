package LLD1.OOPS.ENUM.Example2;

public class Main {
    public static void main(String[] args) {

        Status status = Status.SUCCESS;

        switch (status) {
            case SUCCESS:
                System.out.println("Operation successful");
                break;
            case FAILURE:
                System.out.println("Operation failed");
                break;
            case PENDING:
                System.out.println("Operation pending");
                break;
        }
    }
}

