package decorator2;

public class Main {
    public static void main(String[] args) {
        Clothing baseClothing = new Jeans();
        System.out.println("Base clothing: " + baseClothing.getDescription());

        Clothing clothingWithShirt = new ShirtDecorator(baseClothing);
        System.out.println("Clothing with shirt: " + clothingWithShirt.getDescription());

        Clothing clothingWithHatAndShirt = new HatDecorator(new ShirtDecorator(baseClothing));
        System.out.println("Clothing with hat and shirt: " + clothingWithHatAndShirt.getDescription());
    }
}
