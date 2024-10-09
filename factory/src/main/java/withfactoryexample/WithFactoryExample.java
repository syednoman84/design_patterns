package withfactoryexample;

/*
    How do we avoid the problem?

    Define Factory Interface:
        Create a VehicleFactory interface or abstract class with a method for creating vehicles.
    Implement Concrete Factories:
        Implement concrete factory classes (TwoWheelerFactory and FourWheelerFactory) that implement the VehicleFactory interface and
        provide methods to create instances of specific types of vehicles.
    Refactor Client:
        Modify the Client class to accept a VehicleFactory instance instead of directly instantiating vehicles.
        The client will request a vehicle from the factory, eliminating the need for conditional logic based on vehicle types.
    Enhanced Flexibility:
        With this approach, adding new types of vehicles is as simple as creating a new factory class for the new vehicle type
        without modifying existing client code.
*/
// Driver program
public class WithFactoryExample {
    public static void main(String[] args) {
        VehicleFactory twoWheelerFactory = new TwoWheelerFactory();
        Client twoWheelerClient = new Client(twoWheelerFactory);
        Vehicle twoWheeler = twoWheelerClient.getVehicle();
        twoWheeler.printVehicle();

        VehicleFactory fourWheelerFactory = new FourWheelerFactory();
        Client fourWheelerClient = new Client(fourWheelerFactory);
        Vehicle fourWheeler = fourWheelerClient.getVehicle();
        fourWheeler.printVehicle();
    }
}