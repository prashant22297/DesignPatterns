package AbstractFactoryDesignPattern;

public class PaneerBurgerFactory extends BurgerAbstractFactory {
    @Override
    public Burger createBurger() {
        return new PaneerBurger();
    }
}
