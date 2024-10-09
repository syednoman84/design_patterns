package withoutfactoryexample;

import java.io.*;

/*
    What are the problems with this design?

    Tight Coupling:
        The client class Client directly instantiates the concrete classes (TwoWheeler and FourWheeler) based on the input type provided
        during its construction. This leads to tight coupling between the client and the concrete classes, making the code difficult to
        maintain and extend.
    Violation of Single Responsibility Principle (SRP):
        The Client class is responsible not only for determining which type of vehicle to instantiate based on the input type
        but also for managing the lifecycle of the vehicle object (e.g., cleanup).
        This violates the Single Responsibility Principle, which states that a class should have only one reason to change.
    Limited Scalability:
        Adding a new type of vehicle requires modifying the Client class, which violates the Open-Closed Principle.
        This design is not scalable because it cannot accommodate new types of vehicles without modifying existing code.
*/

// Driver program
public class WithoutFactoryExample {
    public static void main(String[] args) {
        Client pClient = new Client(1);
        Vehicle pVehicle = pClient.getVehicle();
        if (pVehicle != null) {
            pVehicle.printVehicle();
        }
        pClient.cleanup();
    }
}


// Library classes
abstract class Vehicle {
    public abstract void printVehicle();
}

class TwoWheeler extends Vehicle {
    public void printVehicle() {
        System.out.println("I am two wheeler");
    }
}

class FourWheeler extends Vehicle {
    public void printVehicle() {
        System.out.println("I am four wheeler");
    }
}

// Client (or user) class
class Client {
    private Vehicle pVehicle;

    public Client(int type) {
        if (type == 1) {
            pVehicle = new TwoWheeler();
        } else if (type == 2) {
            pVehicle = new FourWheeler();
        } else {
            pVehicle = null;
        }
    }

    public void cleanup() {
        if (pVehicle != null) {
            pVehicle = null;
        }
    }

    public Vehicle getVehicle() {
        return pVehicle;
    }
}


