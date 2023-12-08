package StringDrinkTest;


import Drink.StringCaseChanger;
import Drink.StringDrink;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCaseChangerTest {
    @Test
    public void stringCaseChanger(){
        StringDrink drink = new StringDrink("aBcD");
        StringCaseChanger cc = new StringCaseChanger();
        cc.execute(drink);
        Assertions.assertEquals("AbCd",drink.getText());
    }
}
