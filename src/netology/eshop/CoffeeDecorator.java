package netology.eshop;

abstract class CoffeeDecorator implements Product {
    protected Product decoratedCoffee;

    public CoffeeDecorator(Product decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }

    @Override
    public double getPrice() {
        return decoratedCoffee.getPrice();
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }
}
