package factorymethod.withfactoryexample.withfactoryexample.creatorInterface;

import factorymethod.withfactoryexample.withfactoryexample.productInterface.Vehicle;

// Factory interface defining the factory method
public interface VehicleFactory {
    Vehicle createVehicle();
}
