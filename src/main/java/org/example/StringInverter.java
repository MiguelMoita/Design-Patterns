package org.example;

public class StringInverter implements StringTransformer {
    public void execute(StringDrink drink) {
        StringBuffer stringBuffer = new StringBuffer(drink.getText());
        stringBuffer = stringBuffer.reverse();
        drink.setText(stringBuffer.toString());
    }
}
