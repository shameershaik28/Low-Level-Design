package LLD2.SolidDesignPrinciples.DependencyInversionPrinciple;

class SMSService implements MessageService {
    public void sendMessage(String msg) {
        System.out.println("SMS: " + msg);
    }
}

