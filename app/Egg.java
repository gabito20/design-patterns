package app;

public class Egg extends BurgerDecorator{

    public Egg(BurgerInterface burger)  {
        super(burger);
    }

    public String make() {
        return super.make() + " with egg";
    }

    
}