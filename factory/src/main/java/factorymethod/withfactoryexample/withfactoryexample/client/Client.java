package factorymethod.withfactoryexample.withfactoryexample.client;

import factorymethod.withfactoryexample.withfactoryexample.creatorInterface.VehicleFactory;
import factorymethod.withfactoryexample.withfactoryexample.productInterface.Vehicle;

// Client class
public class Client {
    private Vehicle pVehicle;

    public Client(VehicleFactory factory) {
        pVehicle = factory.createVehicle();
    }

    public Vehicle getVehicle() {
        return pVehicle;
    }
}
