package app;

public class Cheese extends BurgerDecorator{

    public Cheese(BurgerInterface burger)  {
        super(burger);
    }

    public String make() {
        return super.make() + " with cheese";
    }
    
}