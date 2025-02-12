package generics.mealplangenerator;

public class KetoMeal implements MealPlan {
    @Override
    public String getMealType() {
        return "Keto";
    }

    @Override
    public void displayMeal() {
        System.out.println(" Keto Meal: Grilled Chicken, Avocado Salad .");
    }
}

