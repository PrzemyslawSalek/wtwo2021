import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Temperature implements Observable {

    private Random rand;
    private Set<Observer> observers;

    private int minTemperature;
    private int maxTemperature;
    private int currentTemperature;

    public Temperature() {
        this.rand  = new Random();
        this.observers = new HashSet<>();
        this.minTemperature  = -30;
        this.maxTemperature = 30;
        this.currentTemperature = 0;
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(Observer::update);
    }

    public void publishTemperatureChange() {
        currentTemperature = rand.nextInt((maxTemperature - minTemperature) + 1) + minTemperature;
        notifyObservers();
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }
}
