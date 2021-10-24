package Commands;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import System.Receiver;

public class SumarizeCommand implements Command {
    private Receiver receiver;
    String filename;
    String executeTime;

    public SumarizeCommand(Receiver receiver, String filename, String executeTime) {
        this.receiver = receiver;
        this.filename = filename;
        this.executeTime = executeTime;
    }

    @Override
    public void execute() {
        if(receiver.getTime().equals(executeTime)) {
            try {
                BufferedReader br = new BufferedReader(new FileReader(filename));
                String line;
                int sum = 0;

                while ((line = br.readLine()) != null) {
                    if (line.equals("10000")) {
                        sum += 10000;
                    }
                }
                br.close();

                BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true));
                writer.write("sum: " + Integer.toString(sum));
                writer.newLine();
                writer.close();
            } catch (IOException e) {
                e.getStackTrace();
            }
        }
    }
}
