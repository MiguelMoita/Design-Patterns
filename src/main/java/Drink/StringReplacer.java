package Drink;

public class StringReplacer implements StringTransformer {
    private final char oldChar;
    private final char newChar;
        public StringReplacer(char oldChar, char newChar){
            this.oldChar = oldChar;
            this.newChar = newChar;
        }
    @Override
         public void execute(StringDrink drink){
            drink.setText(drink.getText().replace(oldChar,newChar));
        }
    @Override
        public void undo(StringDrink drink){drink.setText(drink.getText().replace(newChar,oldChar));}
}
