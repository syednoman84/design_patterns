package factorymethod.example2.creatorInterface;

import factorymethod.example2.productInterface.Vehicle;

// Factory interface defining the factory method
public interface VehicleFactory {
    Vehicle createVehicle();
}
