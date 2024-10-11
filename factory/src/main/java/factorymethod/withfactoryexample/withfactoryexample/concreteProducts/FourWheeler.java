package factorymethod.withfactoryexample.withfactoryexample.concreteProducts;

import factorymethod.withfactoryexample.withfactoryexample.productInterface.Vehicle;

public class FourWheeler extends Vehicle {
    public void printVehicle() {
        System.out.println("I am four wheeler");
    }
}