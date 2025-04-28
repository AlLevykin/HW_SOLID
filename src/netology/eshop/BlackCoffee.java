package netology.eshop;

public class BlackCoffee implements Product {

    @Override
    public double getPrice() {
        return 100.0;
    }

    @Override
    public String getDescription() {
        return "Кофе";
    }
}
