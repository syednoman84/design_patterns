package withfactoryexample.creatorInterface;

import withfactoryexample.productInterface.Vehicle;

// Factory interface defining the factory method
public interface VehicleFactory {
    Vehicle createVehicle();
}
