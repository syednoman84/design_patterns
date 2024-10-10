package carbuilderexample.builders;

import carbuilderexample.cars.CarType;
import carbuilderexample.components.Engine;
import carbuilderexample.components.GPSNavigator;
import carbuilderexample.components.Transmission;
import carbuilderexample.components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}

