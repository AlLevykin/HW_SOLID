package main.java;

import netology.eshop.CoffeeMachine;
import netology.eshop.Ingredient;
import netology.eshop.Invoice;
import netology.eshop.Product;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Product> order = new ArrayList<>();

        order.add(CoffeeMachine.makeCoffee(new Ingredient[]{
                new Ingredient("Молоко", 10.5),
                new Ingredient("Сахар", 5.99),
                new Ingredient("Корица", 12.51)
        }));

        order.add(CoffeeMachine.makeCoffee(new Ingredient[]{
                new Ingredient("Бренди", 55.45),
                new Ingredient("Сироп", 11.55)
        }));

        order.add(CoffeeMachine.makeCoffee(new Ingredient[]{
                new Ingredient("Сливки", 15.55),
                new Ingredient("Шоколад", 19.35)
        }));

        Invoice.Print(order);
    }
}
