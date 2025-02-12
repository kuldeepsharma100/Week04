package generics.mealplangenerator;

 class HighProteinMeal implements MealPlan {
    @Override
    public String getMealType() {
        return "High-Protein";
    }

    @Override
    public void displayMeal() {
        System.out.println("High-Protein Meal: Boiled Eggs, and Chickpea Salad.");
    }
}
