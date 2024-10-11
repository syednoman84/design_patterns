package withfactoryexample.concreteCreators;

import withfactoryexample.concreteProducts.FourWheeler;
import withfactoryexample.creatorInterface.VehicleFactory;
import withfactoryexample.productInterface.Vehicle;

// Concrete factory class for FourWheeler
public class FourWheelerFactory implements VehicleFactory {
    public Vehicle createVehicle() {
        return new FourWheeler();
    }
}
