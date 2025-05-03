package main.java;

import netology.eshop.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        CoffeeCard coffeeCard = CoffeeCard.getInstance();
        ArrayList<Product> order = new ArrayList<>();

        Menu.Print(coffeeCard);

        order.add(coffeeCard.getCoffee(Recipe.ICE));

        order.add(CoffeeMachine.makeCoffee(
                new Ingredient[]{
                new Ingredient("Молоко", 10.5),
                new Ingredient("Сахар", 5.99),
                new Ingredient("Корица", 12.51)
        }));

        order.add(CoffeeMachine.makeCoffee(
                new Ingredient[]{
                new Ingredient("Бренди", 55.45),
                new Ingredient("Сироп", 11.55)
        }));

        order.add(CoffeeMachine.makeCoffee(
                new Ingredient[]{
                new Ingredient("Сливки", 15.55),
                new Ingredient("Шоколад", 19.35)
        }));

        order.add(coffeeCard.getCoffee(Recipe.IRISH));

        order.add(coffeeCard.getCoffee(Recipe.IRISH));

        Invoice.Print(order);
    }
}
