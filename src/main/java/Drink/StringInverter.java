package Drink;

public class StringInverter implements StringTransformer {
    @Override
    public void execute(StringDrink drink) {
        StringBuffer stringBuffer = new StringBuffer(drink.getText());
        stringBuffer = stringBuffer.reverse();
        drink.setText(stringBuffer.toString());
    }
    @Override
    public  void undo(StringDrink drink){ execute(drink);}
}
