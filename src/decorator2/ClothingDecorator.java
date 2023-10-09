package decorator2;

abstract class ClothingDecorator implements Clothing {
    protected Clothing clothing;

    public ClothingDecorator(Clothing clothing) {
        this.clothing = clothing;
    }

    @Override
    public String getDescription() {
        return clothing.getDescription();
    }
}
