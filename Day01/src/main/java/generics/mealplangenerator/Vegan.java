package generics.mealplangenerator;

 public class Vegan implements MealPlan {
    @Override
    public String getMealType() {
        return "Vegan";
    }

    @Override
    public void displayMeal() {
        System.out.println(" Vegan Meal:  Almond Milk Smoothie.");
    }
}

