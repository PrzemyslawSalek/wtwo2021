public class Colleague {
    private Mediator mediator;
    private String id;
    private String name;

    public Colleague(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void sendMessage(String id, String message, String messageCategory) {
        mediator.sendMessage(this.id, id, message, messageCategory);
    }

    public void receiveMessage(String message) {
        System.out.println("Wiadomość do " + this.name + ": " + message);
    }
}
