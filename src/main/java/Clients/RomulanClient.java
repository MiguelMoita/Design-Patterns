package Clients;

import Strategy.OrderingStrategy;
import  Strategy.ImpatientStrategy;

public class RomulanClient extends AlienClient {

    protected OrderingStrategy createOrderingStrategy() {
        return new ImpatientStrategy();
    }
}
