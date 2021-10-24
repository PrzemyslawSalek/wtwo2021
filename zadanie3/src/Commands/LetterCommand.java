package Commands;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import System.Receiver;

public class LetterCommand implements Command {
    private Receiver receiver;
    String filename;
    String executeTime;

    public LetterCommand(Receiver receiver, String filename, String executeTime) {
        this.receiver = receiver;
        this.filename = filename;
        this.executeTime = executeTime;
    }

    @Override
    public void execute() {
        if(receiver.getTime().equals(executeTime)) {
            try {
                String str = "savetofile";
                BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true));
                writer.write(str);
                writer.newLine();
                writer.close();
            } catch (IOException e) {
                e.getStackTrace();
            }
        }
    }
}
