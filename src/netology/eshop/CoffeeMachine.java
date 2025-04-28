package netology.eshop;

public class CoffeeMachine {

    public static Product makeCoffee(Ingredient[] ingredients) {
        Product coffee = new BlackCoffee();

        if (ingredients != null) {
            for (Ingredient ingredient : ingredients) {
                coffee = new Coffee(coffee, ingredient.Description(), ingredient.Price());
            }
        }

        return coffee;
    }

}
