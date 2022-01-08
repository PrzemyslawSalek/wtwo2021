import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EventBroker {
    Map<Observable, ArrayList<Observer>> eventMap;

    public EventBroker() {
        this.eventMap = new HashMap<Observable, ArrayList<Observer>>();
    }

    public void addPublisher(Observable publisher) {
        if (eventMap.get(publisher) == null) {
            eventMap.put(publisher, new ArrayList<Observer>());
        }
    }

    public void addSubscriber(Observable publisher, Observer subscriber) {
        if (eventMap.get(publisher) != null) {
            eventMap.get(publisher).add(subscriber);
        }
    }

    public void notifyObservers(Observable publisher) {
        eventMap.get(publisher).forEach(Observer::update);
    }
}
