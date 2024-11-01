package icecreamexample.abstractdecorator;

import icecreamexample.interfaces.Icecream;

public abstract class IcecreamDecorator implements Icecream {

    protected Icecream specialIcecream;

    public IcecreamDecorator(Icecream specialIcecream) {
        this.specialIcecream = specialIcecream;
    }

    public String makeIcecream() {
        return specialIcecream.makeIcecream();
    }
}