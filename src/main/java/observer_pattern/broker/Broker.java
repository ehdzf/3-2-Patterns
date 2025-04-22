package observer_pattern.broker;

import observer_pattern.publisher.EventManager;
import observer_pattern.stock.Stock;
import observer_pattern.subscriber.StockEventListener;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Broker {
    private final EventManager publisher;
    private final Map<String, Double> lastPrices = new HashMap<>();

    public Broker() {
        this.publisher = new EventManager(List.of("drop", "rise"));
    }

    public void subscribe(String topic, StockEventListener listener) {
        publisher.subscribe(topic, listener);
    }

    public void processStockPrice(Stock stock) {
        String stockName = stock.getName();
        double currentPrice = stock.getPrice();

        if (lastPrices.containsKey(stockName)) {
            double previousPrice = lastPrices.get(stockName);

            if (currentPrice > previousPrice) {
                publisher.notify("rise", stock);
            } else if (currentPrice < previousPrice) {
                publisher.notify("drop", stock);
            }
        }

        lastPrices.put(stockName, currentPrice);
    }
}
