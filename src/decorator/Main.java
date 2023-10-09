package decorator;

public class Main {
    public static void main(String[] args) {
        // Создаем простой кофе
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println("Cost of simple coffee: $" + simpleCoffee.cost());

        // Добавляем молоко к кофе
        Coffee milkCoffee = new MilkDecorator(simpleCoffee);
        System.out.println("Cost of milk coffee: $" + milkCoffee.cost());

        // Добавляем сахар к кофе
        Coffee sugarMilkCoffee = new SugarDecorator(milkCoffee);
        System.out.println("Cost of sugar milk coffee: $" + sugarMilkCoffee.cost());
    }
}