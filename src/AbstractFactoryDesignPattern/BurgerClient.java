package AbstractFactoryDesignPattern;

public class BurgerClient {
    public static void main(String[] args) {
        Burger burger = BurgerFactory.getBurger(new PaneerBurgerFactory());
        System.out.println(burger.name());
        System.out.println(burger.price());

        Burger burger1 = BurgerFactory.getBurger(new VegBurgerFactory());
        System.out.println(burger1.name());
        System.out.println(burger1.price());
    }
}
