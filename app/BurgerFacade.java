package app;

public class BurgerFacade {

    public static String makeBurger(String type) {

        if (type == "egg") {
            BurgerInterface eggBurger = new Egg(new Burger());
            return eggBurger.make();
        }else if (type == "cheese") {
            BurgerInterface cheeseBurger = new Cheese(new Burger());
            return cheeseBurger.make();
        }else {
            BurgerInterface classicBurger = new Burger();
            return classicBurger.make();
        }
    }

}