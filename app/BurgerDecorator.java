package app;

public abstract class BurgerDecorator implements BurgerInterface{
    private BurgerInterface burger;

    public BurgerDecorator(BurgerInterface burger) {
        this.burger = burger;
    }

    public String make() {
        return burger.make();
    }
    
}