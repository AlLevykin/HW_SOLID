package netology.eshop;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CoffeeCard implements Iterable<Product> {

    private final Map<String, Product> items = new HashMap<>();
    private static final CoffeeCard instance = new CoffeeCard();

    private CoffeeCard() {
        items.put(Recipe.BLACK.toString(), new BlackCoffee());
        items.put(Recipe.IRISH.toString(),
                CoffeeMachine.makeCoffee(
                Recipe.IRISH,
                new Ingredient[]{
                        new Ingredient("Виски", 50.5),
                        new Ingredient("Сахар", 5.99),
                        new Ingredient("Сливки", 15.55)
                }));
        items.put(Recipe.ICE.toString(),
                CoffeeMachine.makeCoffee(
                Recipe.ICE,
                new Ingredient[]{
                        new Ingredient("Мороженое", 15.55)
                }));
        items.put(Recipe.BAILEYS.toString(),CoffeeMachine.makeCoffee(
                Recipe.BAILEYS,
                new Ingredient[]{
                        new Ingredient("Мятный ликер", 35.5),
                        new Ingredient("Сахар", 5.99),
                        new Ingredient("Сливки", 15.55)
                }));

    }

    @Override
    public Iterator<Product> iterator() {
        return items.values().iterator();
    }

    public Product getCoffee(Recipe recipe) {
        return items.getOrDefault(recipe.toString(), items.get(Recipe.BLACK.toString()));
    }

    public static CoffeeCard getInstance() {
        return instance;
    }
}
