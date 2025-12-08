package LLD2.SolidDesignPrinciples.DependencyInversionPrinciple;

class EmailService implements MessageService {
    public void sendMessage(String msg) {
        System.out.println("Email: " + msg);
    }
}

