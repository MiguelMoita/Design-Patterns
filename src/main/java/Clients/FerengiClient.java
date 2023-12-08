package Clients;

import Strategy.OrderingStrategy;
import Strategy.SmartStrategy;

public class FerengiClient extends AlienClient {
    @Override
    protected OrderingStrategy createOrderingStrategy() {
        return new SmartStrategy();
    }
}
