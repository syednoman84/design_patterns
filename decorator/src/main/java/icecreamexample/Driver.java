package icecreamexample;

import icecreamexample.concreteclasses.SimpleIcecream;
import icecreamexample.decorators.HoneyDecorator;
import icecreamexample.decorators.NuttyDecorator;
import icecreamexample.interfaces.Icecream;

public class Driver {

    public static void main(String args[]) {
        Icecream icecream = new HoneyDecorator(new NuttyDecorator(new SimpleIcecream()));
        System.out.println(icecream.makeIcecream());
    }
}
