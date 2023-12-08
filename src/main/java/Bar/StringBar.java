package Bar;

import Drink.StringDrink;
import Drink.StringRecipe;

import java.util.ArrayList;
import java.util.List;

public class StringBar extends Bar {
    private boolean isHappyHour = false;

    public  StringBar(){ this(new ArrayList<>());}
    public StringBar(List<BarObserver>observers) { super(observers);}
    public boolean isHappyHour(){ return  isHappyHour;}
    public void startHappyHour(){
        isHappyHour = true;
        notifyObservers();
    }
    public void endHappyHour(){
        isHappyHour = false;
        notifyObservers();
    }

    public void order(StringDrink drink, StringRecipe recipe) { recipe.mix(drink);}
}
