package decorator2;

class HatDecorator extends ClothingDecorator {
    public HatDecorator(Clothing clothing) {
        super(clothing);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Hat";
    }
}
