package icecreamexample.concreteclasses;

import icecreamexample.interfaces.Icecream;

public class SimpleIcecream implements Icecream {

    @Override
    public String makeIcecream() {
        return "Base Icecream";
    }
}