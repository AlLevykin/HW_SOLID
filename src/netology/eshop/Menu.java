package netology.eshop;

public class Menu {

    public static void Print(Iterable<Product> items) {
        System.out.println("Кофейная карта:");
        items.forEach(product -> System.out.printf("%s - %.2f\n", product.getName(), product.getPrice()));
        System.out.print("-------------------------------------\n\n");
    }
}