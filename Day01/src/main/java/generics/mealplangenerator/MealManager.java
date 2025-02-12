package generics.mealplangenerator;
import java.util.*;


public class MealManager<T extends MealPlan> {
    private List<T> meals = new ArrayList<>();

    public void addMeal(T meal) {
        meals.add(meal);
    }

    public void showMealPlan() {
        for (T meal : meals) {
            meal.displayMeal();
        }
    }

    public  <T extends MealPlan> void generateMealPlan(T meal) {
        System.out.println(" Generating Personalized Meal Plan for " + meal.getMealType() + " Diet:");
        meal.displayMeal();
        System.out.println();
    }
}

