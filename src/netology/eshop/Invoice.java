package netology.eshop;

public class Invoice {

    public static void Print(Iterable<Product> order) {
        order.forEach(product -> System.out.printf("Ингредиенты: %s, Цена: %.2f\n",product.getDescription(), product.getPrice()));
    }
}
