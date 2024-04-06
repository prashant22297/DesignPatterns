package AbstractFactoryDesignPattern;

public class BurgerFactory {
    public static Burger getBurger(BurgerAbstractFactory burgerAbstractFactory) {
        return burgerAbstractFactory.createBurger();
    }
}
