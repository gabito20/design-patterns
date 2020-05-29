package app;

public class App {
    public static void main(String[] args) throws Exception {

        String classicBurger = BurgerFacade.makeBurger("classic");
        System.out.println(classicBurger);
        
        String cheeseBurger = BurgerFacade.makeBurger("cheese");
        System.out.println(cheeseBurger);

        String eggBurger = BurgerFacade.makeBurger("egg");
        System.out.println(eggBurger);

    }
}