package Client;

import Bar.BarObserver;
import Bar.StringBar;
import Drink.StringDrink;
import Drink.StringRecipe;

public interface Client extends BarObserver {
    void wants(StringDrink drink, StringRecipe recipe, StringBar bar);
}
