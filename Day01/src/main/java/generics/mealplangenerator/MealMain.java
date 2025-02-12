package generics.mealplangenerator;

public class MealMain {

    public static void main(String[] args) {
        MealManager<Vegan> vegan = new MealManager<>();
        vegan.addMeal(new Vegan());
        vegan.generateMealPlan(new Vegan());

        MealManager<KetoMeal> keto = new MealManager<>();
        keto.addMeal(new KetoMeal());
        keto.generateMealPlan(new KetoMeal());

        MealManager<HighProteinMeal> protein = new MealManager<>();
        protein.addMeal(new HighProteinMeal());
        protein.generateMealPlan(new HighProteinMeal());
    }
}
