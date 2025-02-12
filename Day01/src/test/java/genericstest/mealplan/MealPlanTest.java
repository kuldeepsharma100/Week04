package genericstest.mealplan;

import generics.mealplangenerator.MealManager;
import generics.mealplangenerator.Vegan;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class MealPlanTest {
    @Test
    public void test1() {
        //Test for Vegeterian Meal

        Vegan v = new Vegan();

        Assert.assertEquals("Vegan", v.getMealType());
    }
}
