# Single-responsibility principle

- Класс [Coffee](https://github.com/AlLevykin/HW_SOLID/blob/main/src/netology/eshop/Coffee.java) отвечает за хранение данных о конкретном кофейном напитке
- Класс [CoffeeMachine](https://github.com/AlLevykin/HW_SOLID/blob/main/src/netology/eshop/CoffeeMachine.java) порождающий класс, который отвечает за создание экземпляров кофейных напитков
- Класс [CoffeeCard](https://github.com/AlLevykin/HW_SOLID/blob/main/src/netology/eshop/CoffeeCard.java) работает со списком готовых рецептов кофейных напитков
- Класс [Menu](https://github.com/AlLevykin/HW_SOLID/blob/main/src/netology/eshop/Menu.java) распечатывает список различных кофейных напитков в виде меню
- Класс [Invoice](https://github.com/AlLevykin/HW_SOLID/blob/main/src/netology/eshop/Invoice.java) распечатывает список различных кофейных напитков в виде счета-фактуры

# Open-closed principle

Все классы кофейных напитков, которые составляют кофейную карту и могут быть включены в заказ реализуют интерфейс [Product](https://github.com/AlLevykin/HW_SOLID/blob/main/src/netology/eshop/Product.java). Для реализации различных кофейных напитков используется абстрактный класс [CoffeeDecorator](https://github.com/AlLevykin/HW_SOLID/blob/main/src/netology/eshop/CoffeeDecorator.java). Класс [CoffeeMachine](https://github.com/AlLevykin/HW_SOLID/blob/main/src/netology/eshop/CoffeeMachine.java) строит экземпляры кофейных напитков, добавляя к базовому классу [BlackCoffee](https://github.com/AlLevykin/HW_SOLID/blob/main/src/netology/eshop/BlackCoffee.java) различные ингредиенты.

# Liskov substitution principle

Класы [Menu](https://github.com/AlLevykin/HW_SOLID/blob/main/src/netology/eshop/Menu.java) и [Invoice](https://github.com/AlLevykin/HW_SOLID/blob/main/src/netology/eshop/Invoice.java) имеют методы Print, получающие на вход итерируемый объект со списком кофейных напитков. Каждый из методов выполняет специфическую печать. Это два различных класса, которые реализованы без использования наследования.

# Interface segregation principle

В ДЗ реализован один интерфейс [Product](https://github.com/AlLevykin/HW_SOLID/blob/main/src/netology/eshop/Product.java). Если в будущем потребуется добавить для кофейных напитков новый функционал, то нужно будет реализовать новый интерфейс, а не расширять существующий Product. 

# Dependency inversion principle

Класы [Menu](https://github.com/AlLevykin/HW_SOLID/blob/main/src/netology/eshop/Menu.java) и [Invoice](https://github.com/AlLevykin/HW_SOLID/blob/main/src/netology/eshop/Invoice.java) работают со списками экземпляров, реализующих интерфейс [Product](https://github.com/AlLevykin/HW_SOLID/blob/main/src/netology/eshop/Product.java). Выполнение печати не зависит от внутренней реализации классов. При необходимости к классам кофейных напитков могут быть добавлены классы других напитков или блюд, имеющие иную реализацию, но обладающие интерфейсом Product. Добавление новых классов не потребует доработки классов Menu и Invoice.  