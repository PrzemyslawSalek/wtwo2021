import java.util.Random;

public class Temperature implements Observable {

    private Random rand;
    private EventBroker eventBroker;

    private int minTemperature;
    private int maxTemperature;
    private int currentTemperature;

    public Temperature(EventBroker eventBroker) {
        this.rand  = new Random();
        this.eventBroker = eventBroker;
        this.minTemperature  = -30;
        this.maxTemperature = 30;
        this.currentTemperature = 0;
    }

    @Override
    public void notifyObservers() {
        eventBroker.notifyObservers(this);
    }

    public void publishTemperatureChange() {
        currentTemperature = rand.nextInt((maxTemperature - minTemperature) + 1) + minTemperature;
        notifyObservers();
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }
}
