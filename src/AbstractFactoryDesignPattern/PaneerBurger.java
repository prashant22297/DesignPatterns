package AbstractFactoryDesignPattern;

public class PaneerBurger implements Burger {
    @Override
    public String name() {
        return "This is a Paneer Burger.";
    }

    @Override
    public int price() {
        return 100;
    }
}
