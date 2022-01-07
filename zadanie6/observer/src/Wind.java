import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Wind implements Observable {

    Random rand;
    private Set<Observer> observers;

    private int minWindSpeed;
    private int maxWindSpeed;
    private int currentWindSpeed;
    
    public Wind() {
        this.rand = new Random();
        this.observers = new HashSet<>();
        this.minWindSpeed = 0;
        this.maxWindSpeed = 99;
        this.currentWindSpeed = 0;
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

    public void publishWindChange() {
        currentWindSpeed = rand.nextInt((maxWindSpeed - minWindSpeed) + 1) + minWindSpeed;
        notifyObservers();
    }

    public int getCurrentWindSpeed() {
        return currentWindSpeed;
    }
}
