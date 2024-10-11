package factorymethod.example2.client;

import factorymethod.example2.creatorInterface.VehicleFactory;
import factorymethod.example2.productInterface.Vehicle;

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
