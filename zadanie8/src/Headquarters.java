import java.util.HashMap;

public class Headquarters implements Mediator {
    private HashMap<String, Colleague> colleagues = new HashMap<String, Colleague>();

    public void addColleague(Colleague colleague) {
        colleague.addMediator(this);
        colleagues.put(colleague.getId(), colleague);
    }

    @Override
    public void sendMessage(String senderId, String receiverId, String message, String messageCategory) {
        System.out.println("> " + messageCategory + " z " + colleagues.get(senderId).getName() + " do "
        + colleagues.get(receiverId).getName() + ": " + message);
        
        if (messageCategory.equals("Doniesienie")) {
            colleagues.get("commandCenter").receiveMessage(message);
        }
        colleagues.get(receiverId).receiveMessage(message);
    }
}
