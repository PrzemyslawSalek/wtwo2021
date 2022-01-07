import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class TemperatureAverage implements Observer {

    private final Temperature temperature;
    private Queue<Integer> lastFiveTemperatures;
    private double averageTemperature;

    public TemperatureAverage(Temperature temperature) {
        this.temperature = temperature;
        this.lastFiveTemperatures = new ArrayDeque<Integer>();
        averageTemperature = 0;
    }

    @Override
    public void update() {
        if (lastFiveTemperatures.size() == 5) {
            lastFiveTemperatures.poll();
        }
        lastFiveTemperatures.add(temperature.getCurrentTemperature());

        averageTemperature = 0;
        Iterator<Integer> it = lastFiveTemperatures.iterator();
        while (it.hasNext()) {
            averageTemperature += it.next();
        }
        averageTemperature /= lastFiveTemperatures.size();

        System.out.println("Average temperature: " + averageTemperature);
    }
}
