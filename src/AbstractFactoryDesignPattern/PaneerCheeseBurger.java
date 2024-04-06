package AbstractFactoryDesignPattern;

public class PaneerCheeseBurger implements Burger {
    @Override
    public String name() {
        return "This is a Paneer Cheese Burger.";
    }

    @Override
    public int price() {
        return 120;
    }
}
