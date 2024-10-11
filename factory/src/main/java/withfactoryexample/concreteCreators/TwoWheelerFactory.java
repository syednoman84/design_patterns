package withfactoryexample.concreteCreators;

import withfactoryexample.concreteProducts.TwoWheeler;
import withfactoryexample.creatorInterface.VehicleFactory;
import withfactoryexample.productInterface.Vehicle;

// Concrete factory class for TwoWheeler
public class TwoWheelerFactory implements VehicleFactory {
    public Vehicle createVehicle() {
        return new TwoWheeler();
    }
}
