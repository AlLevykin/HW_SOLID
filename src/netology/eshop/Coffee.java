package netology.eshop;

public class Coffee extends CoffeeDecorator {

    private final String name;
    private final double price;
    private final String description;

    public Coffee(Product decoratedCoffee, String name, String ingredientDescription, double ingredientPrice) {
        super(decoratedCoffee);
        this.name = name;
        this.description = ingredientDescription;
        this.price = ingredientPrice;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + price;
    }

    @Override
    public String getDescription() {
        return String.format("%s, %s", super.getDescription(), description);
    }
}
