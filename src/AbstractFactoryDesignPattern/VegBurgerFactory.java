package AbstractFactoryDesignPattern;

public class VegBurgerFactory extends BurgerAbstractFactory {
    @Override
    public Burger createBurger() {
        return new VegBurger();
    }
}
