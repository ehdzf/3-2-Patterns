package observer_pattern.subscriber;

import observer_pattern.stock.Stock;

public interface StockEventListener {

    void update(String topic, Stock message);
}
