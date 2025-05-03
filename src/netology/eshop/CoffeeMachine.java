package netology.eshop;

public class CoffeeMachine {

    public static Product makeCoffee(Recipe recipe, Ingredient[] ingredients) {
        Product coffee = new BlackCoffee();

        if (ingredients != null) {
            for (Ingredient ingredient : ingredients) {
                coffee = new Coffee(coffee, recipe.getName(), ingredient.Description(), ingredient.Price());
            }
        }

        return coffee;
    }

    public static Product makeCoffee(Ingredient[] ingredients) {
        return makeCoffee(Recipe.EXCLUSIVE, ingredients);
    }

}
