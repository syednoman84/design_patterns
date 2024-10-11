package factorymethod.example2.concreteProducts;

import factorymethod.example2.productInterface.Vehicle;

public class TwoWheeler extends Vehicle {
    public void printVehicle() {
        System.out.println("I am two wheeler");
    }
}