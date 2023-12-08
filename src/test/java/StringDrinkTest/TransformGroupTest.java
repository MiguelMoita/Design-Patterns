package StringDrinkTest;


import Drink.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


public class TransformGroupTest {
    @Test
    public void transformerGroup() {
        StringDrink drink = new StringDrink( "AbCd-aBcD");
        StringInverter si = new StringInverter();
        StringCaseChanger cc = new StringCaseChanger();
        List<StringTransformer> transformers = new ArrayList<>();
        transformers.add(si);
        transformers.add(cc);
        StringTransformerGroup tg = new StringTransformerGroup(transformers);
        tg.execute(drink);
        Assertions.assertEquals("dCbA-DcBa", drink.getText());
    }

}
