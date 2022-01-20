import java.util.Random;
import java.util.concurrent.TimeUnit;

public class App {
    private enum Category {
        SPAM {
            public String toString() {
                return "SPAM";
            }
        },
        IMPORTANT {
            public String toString() {
                return "IMPORTANT";
            }
        },
        OTHER {
            public String toString() {
                return "OTHER";
            }
        };
        
        public static Category getRandomCategory() {
            Random random = new Random();
            return values()[random.nextInt(values().length)];
        }
    }

    public static void main(String[] args) throws Exception {
        Handler importantHandler = new ImportantHandler();
        Handler spamHandler = new SpamHandler();
        Handler otherHandler = new OtherHandler();
        importantHandler.setSuccessor(spamHandler);
        spamHandler.setSuccessor(otherHandler);

        while (true) {
            TimeUnit.SECONDS.sleep(2);
            Text text = new Text("Ala ma kota.", Category.getRandomCategory().toString());
            importantHandler.handle(text);
            System.out.println(text.getText());
        }
    }
}
