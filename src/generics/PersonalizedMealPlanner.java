package generics;

/*
 * Interface representing a generic meal plan.
 * All meal types must implement this interface.
 */
interface MealPlan {

    String getMealType();
}

/*
 * Represents a vegetarian meal plan.
 */
class VegetarianMeal implements MealPlan {

    public String getMealType() {
        return "Vegetarian Meal Plan";
    }
}

/*
 * Represents a vegan meal plan.
 */
class VeganMeal implements MealPlan {

    public String getMealType() {
        return "Vegan Meal Plan";
    }
}

/*
 * Represents a keto meal plan.
 */
class KetoMeal implements MealPlan {

    public String getMealType() {
        return "Keto Meal Plan";
    }
}

/*
 * Represents a high-protein meal plan.
 */
class HighProteinMeal implements MealPlan {

    public String getMealType() {
        return "High Protein Meal Plan";
    }
}

/*
 * Generic Meal class that handles different meal plans safely.
 */
class Meal<T extends MealPlan> {

    private T mealPlan;

    // Constructor to initialize meal
    public Meal(T mealPlan) {
        this.mealPlan = mealPlan;
    }

    // Displays meal plan
    public void displayMeal() {
        System.out.println("Generated: " + mealPlan.getMealType());
    }
}

/*
 * Utility class demonstrating generic methods.
 */
class MealPlanGenerator {

    // Generic method to validate and generate meal plans
    public static <T extends MealPlan> Meal<T> generateMealPlan(T mealType) {
        return new Meal<>(mealType);
    }
}

/*
 * Main class to demonstrate personalized meal plan generation.
 */
public class PersonalizedMealPlanner {

    public static void main(String[] args) {

        Meal<VegetarianMeal> vegMeal =
                MealPlanGenerator.generateMealPlan(new VegetarianMeal());

        Meal<VeganMeal> veganMeal =
                MealPlanGenerator.generateMealPlan(new VeganMeal());

        Meal<KetoMeal> ketoMeal =
                MealPlanGenerator.generateMealPlan(new KetoMeal());

        Meal<HighProteinMeal> proteinMeal =
                MealPlanGenerator.generateMealPlan(new HighProteinMeal());

        vegMeal.displayMeal();
        veganMeal.displayMeal();
        ketoMeal.displayMeal();
        proteinMeal.displayMeal();
    }
}

