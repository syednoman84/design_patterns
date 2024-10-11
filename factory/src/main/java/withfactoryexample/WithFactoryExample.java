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

import withfactoryexample.client.Client;
import withfactoryexample.concreteCreators.FourWheelerFactory;
import withfactoryexample.concreteCreators.TwoWheelerFactory;
import withfactoryexample.creatorInterface.VehicleFactory;
import withfactoryexample.productInterface.Vehicle;

/*
    Components of Factory Method Design Pattern

    1. Creator
    This is an abstract class or an interface that declares the factory method.
    The creator typically contains a method that serves as a factory for creating objects.
    It may also contain other methods that work with the created objects.

    2. Concrete Creator
    Concrete Creator classes are subclasses of the Creator that implement the factory method to create specific types of objects.
    Each Concrete Creator is responsible for creating a particular product.

    3. Product
    This is the interface or abstract class for the objects that the factory method creates.
    The Product defines the common interface for all objects that the factory method can create.

    4. Concrete Product
    Concrete Product classes are the actual objects that the factory method creates.
    Each Concrete Product class implements the Product interface or extends the Product abstract class.
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