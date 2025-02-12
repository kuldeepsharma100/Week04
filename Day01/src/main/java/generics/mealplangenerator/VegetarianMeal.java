package generics.mealplangenerator;

 class VegetarianMeal implements MealPlan {

     public String getMealType(){
         return "Vegetarian";
     }

     public void displayMeal(){
         System.out.println(" Veg Meal: salad, pizza ");
     }
}
