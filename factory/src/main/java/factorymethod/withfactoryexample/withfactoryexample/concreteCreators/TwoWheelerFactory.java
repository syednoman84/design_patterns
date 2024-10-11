package factorymethod.withfactoryexample.withfactoryexample.concreteCreators;

import factorymethod.withfactoryexample.withfactoryexample.concreteProducts.TwoWheeler;
import factorymethod.withfactoryexample.withfactoryexample.creatorInterface.VehicleFactory;
import factorymethod.withfactoryexample.withfactoryexample.productInterface.Vehicle;

// Concrete factory class for TwoWheeler
public class TwoWheelerFactory implements VehicleFactory {
    public Vehicle createVehicle() {
        return new TwoWheeler();
    }
}
