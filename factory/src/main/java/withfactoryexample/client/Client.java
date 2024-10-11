package withfactoryexample.client;

import withfactoryexample.creatorInterface.VehicleFactory;
import withfactoryexample.productInterface.Vehicle;

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
