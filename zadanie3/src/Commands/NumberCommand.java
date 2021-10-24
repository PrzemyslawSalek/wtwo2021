package Commands;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import System.Receiver;

public class NumberCommand implements Command {
    private Receiver receiver;
    String filename;
    String executeTime;

    public NumberCommand(Receiver receiver, String filename, String executeTime) {
        this.receiver = receiver;
        this.filename = filename;
        this.executeTime = executeTime;
    }

    @Override
    public void execute() {
        if(receiver.getTime().equals(executeTime)) {
            try {
                int num = 10000;
                BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true));
                writer.write(Integer.toString(num));
                writer.newLine();
                writer.close();
            } catch (IOException e) {
                e.getStackTrace();
            }
        }
    }
}
