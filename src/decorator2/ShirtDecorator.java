package decorator2;

class ShirtDecorator extends ClothingDecorator {
    public ShirtDecorator(Clothing clothing) {
        super(clothing);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Shirt";
    }
}