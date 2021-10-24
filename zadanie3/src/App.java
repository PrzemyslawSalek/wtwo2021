import java.util.ArrayList;

import Commands.*;
import System.Receiver;

public class App {
    public static void main(String[] args) throws Exception {
        String filename = "test.txt";

        ArrayList <Command> commandQueue = new ArrayList <>();    
        Receiver receiver = new Receiver();

        commandQueue.add(new LetterCommand(receiver, filename, "01:23"));
        commandQueue.add(new LetterCommand(receiver, filename, "00:01"));
        commandQueue.add(new NumberCommand(receiver, filename, "01:04"));
        commandQueue.add(new NumberCommand(receiver, filename, "12:53"));
        commandQueue.add(new SumarizeCommand(receiver, filename, "21:33"));
        commandQueue.add(new SumarizeCommand(receiver, filename, "12:43"));

        do {
            System.out.println("Aktualny czas: " + receiver.getTime());

            for (Command command : commandQueue) {
                command.execute();
            }

            receiver.timeUp();
        } while(!receiver.getTime().equals("00:00"));
    }
}
