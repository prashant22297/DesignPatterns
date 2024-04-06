package AbstractFactoryDesignPattern;

public class PaneerCheeseBurgerFactory extends BurgerAbstractFactory {
    @Override
    public Burger createBurger() {
        return new PaneerCheeseBurger();
    }
}
