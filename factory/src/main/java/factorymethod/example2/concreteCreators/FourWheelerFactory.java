package factorymethod.example2.concreteCreators;

import factorymethod.example2.concreteProducts.FourWheeler;
import factorymethod.example2.creatorInterface.VehicleFactory;
import factorymethod.example2.productInterface.Vehicle;

// Concrete factory class for FourWheeler
public class FourWheelerFactory implements VehicleFactory {
    public Vehicle createVehicle() {
        return new FourWheeler();
    }
}
