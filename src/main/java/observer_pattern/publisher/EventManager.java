package observer_pattern.publisher;

import observer_pattern.stock.Stock;
import observer_pattern.subscriber.StockEventListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {
    private final Map<String, List<StockEventListener>> listeners = new HashMap<>();

    public EventManager(List<String> topics) {
        for (String topic : topics) {
            listeners.put(topic, new ArrayList<>());
        }
    }

    public void subscribe(String topic, StockEventListener stockEventListener) {
        List<StockEventListener> subscribers = listeners.get(topic);
        subscribers.add(stockEventListener);
    }

    public void notify(String topic, Stock message) {
        List<StockEventListener> subscribers = listeners.get(topic);
        for (StockEventListener stockEventListener : subscribers) {
            stockEventListener.update(topic, message);
        }
    }
}
