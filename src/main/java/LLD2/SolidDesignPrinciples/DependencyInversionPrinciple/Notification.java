package LLD2.SolidDesignPrinciples.DependencyInversionPrinciple;

class Notification {
    private MessageService messageService;

    // Dependency is injected via constructor
    public Notification(MessageService messageService) {
        this.messageService = messageService;
    }

    public void notifyUser(String msg) {
        messageService.sendMessage(msg);
    }
}

