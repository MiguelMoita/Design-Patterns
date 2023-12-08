package Bar;

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
}
