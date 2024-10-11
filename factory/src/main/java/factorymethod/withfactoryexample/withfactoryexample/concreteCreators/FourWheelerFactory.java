package factorymethod.withfactoryexample.withfactoryexample.concreteCreators;

import factorymethod.withfactoryexample.withfactoryexample.concreteProducts.FourWheeler;
import factorymethod.withfactoryexample.withfactoryexample.creatorInterface.VehicleFactory;
import factorymethod.withfactoryexample.withfactoryexample.productInterface.Vehicle;

// Concrete factory class for FourWheeler
public class FourWheelerFactory implements VehicleFactory {
    public Vehicle createVehicle() {
        return new FourWheeler();
    }
}
