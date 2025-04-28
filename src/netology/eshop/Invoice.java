package netology.eshop;

import java.util.stream.StreamSupport;

public class Invoice {

    public static void Print(Iterable<Product> order) {
        order.forEach(product -> System.out.printf("Ингредиенты: %s, Цена: %.2f\n", product.getDescription(), product.getPrice()));
        System.out.printf("Итого: %.2f\n", StreamSupport.stream(order.spliterator(), false).mapToDouble(Product::getPrice).sum());
    }
}
