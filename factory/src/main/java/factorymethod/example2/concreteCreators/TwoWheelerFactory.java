package factorymethod.example2.concreteCreators;

import factorymethod.example2.concreteProducts.TwoWheeler;
import factorymethod.example2.creatorInterface.VehicleFactory;
import factorymethod.example2.productInterface.Vehicle;

// Concrete factory class for TwoWheeler
public class TwoWheelerFactory implements VehicleFactory {
    public Vehicle createVehicle() {
        return new TwoWheeler();
    }
}
