package decorator;

class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }
    public double cost() {
        return super.cost() + 2.0;
    }
}
