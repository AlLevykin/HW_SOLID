package netology.eshop;

public class Coffee extends CoffeeDecorator {

    private final double price;
    private final String description;

    public Coffee(Product decoratedCoffee, String ingredientDescription, double ingredientPrice) {
        super(decoratedCoffee);
        this.description = ingredientDescription;
        this.price = ingredientPrice;
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
