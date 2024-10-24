package com.computerexample.client;

import com.computerexample.component.Component;
import com.computerexample.composite.Composite;
import com.computerexample.leaf.Leaf;

/*
    The Composite Design Pattern has four main components -:

    1) component — is the base interface for all the objects in the composition. It should be either an interface or an abstract class with the common methods to manage the child composites.
    2) leaf — implements the default behavior of the base component. It doesn’t contain a reference to the other objects.
    3) composite — has leaf elements. It implements the base component methods and defines the child-related operations.
    4) client — has access to the composition elements by using the base component object.
*/

public class Client
{
    public static void main(String[] args)
    {
        Component hdd       = new Leaf("hdd" , 4000);
        Component keyboard  = new Leaf("keyboard",1000);
        Component mouse     = new Leaf("mouse",500);
        Component ram       = new Leaf("ram",3000);
        Component processor = new Leaf("Processor",10000);


        Composite computer = new Composite("computer");

        Composite motherboard = new Composite("motherboard");
        motherboard.add(ram);
        motherboard.add(processor);


        Composite cabinet  = new Composite("cabinet");
        cabinet.add(hdd);
        cabinet.add(motherboard);

        Composite peripherals     = new Composite("peripherals");
        peripherals.add(keyboard);
        peripherals.add(mouse);

        computer.add(cabinet);
        computer.add(peripherals);

        computer.showPrice();
    }
}