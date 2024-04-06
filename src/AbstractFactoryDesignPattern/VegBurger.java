package AbstractFactoryDesignPattern;

public class VegBurger implements Burger {
    @Override
    public String name() {
        return "This is a Veg Burger.";
    }

    @Override
    public int price() {
        return 90;
    }
}
