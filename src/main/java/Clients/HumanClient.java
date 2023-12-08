package Clients;

import Drink.StringDrink;
import Drink.StringRecipe;
import Strategy.OrderingStrategy;
import Bar.*;
public class HumanClient implements Client {

    private OrderingStrategy strategy;

    public HumanClient(OrderingStrategy strategy) {
        this.strategy = strategy;
    }


    public void happyHourStarted(Bar bar) {
        if (bar instanceof StringBar)
            strategy.happyHourStarted((StringBar) bar);
    }

    public void happyHourEnded(Bar bar) {
        if (bar instanceof StringBar) {
            strategy.happyHourStarted((StringBar) bar);
        }
    }

    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        strategy.wants(drink, recipe, bar);
    }

}
