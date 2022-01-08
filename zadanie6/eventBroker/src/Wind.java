import java.util.Random;

public class Wind implements Observable {

    Random rand;
    private EventBroker eventBroker;

    private int minWindSpeed;
    private int maxWindSpeed;
    private int currentWindSpeed;
    
    public Wind(EventBroker eventBroker) {
        this.rand = new Random();
        this.eventBroker = eventBroker;
        this.minWindSpeed = 0;
        this.maxWindSpeed = 99;
        this.currentWindSpeed = 0;
    }

    @Override
    public void notifyObservers() {
        eventBroker.notifyObservers(this);
    }

    public void publishWindChange() {
        currentWindSpeed = rand.nextInt((maxWindSpeed - minWindSpeed) + 1) + minWindSpeed;
        notifyObservers();
    }

    public int getCurrentWindSpeed() {
        return currentWindSpeed;
    }
}
