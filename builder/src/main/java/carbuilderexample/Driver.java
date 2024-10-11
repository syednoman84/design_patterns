package carbuilderexample;

import carbuilderexample.builders.CarBuilder;
import carbuilderexample.builders.CarManualBuilder;
import carbuilderexample.cars.Car;
import carbuilderexample.cars.Manual;
import carbuilderexample.director.Director;

/*
    The Builder pattern is a well-known pattern in Java world.
    It’s especially useful when you need to create an object with lots of possible configuration options.

    In this example, the Builder pattern allows step by step construction of different car models.

    The example also shows how Builder produces products of different kinds (car manual) using the same building steps.

    The Director controls the order of the construction. It knows which building steps to call to produce this or that car model.
    It works with builders only via their common interface. This allows passing different types of builders to the director.

    The end result is retrieved from the builder object because the director can’t know the type of resulting product.
    Only the Builder object knows what does it build exactly.
*/

/**
 * Demo class. Everything comes together here.
 */
public class Driver {

    public static void main(String[] args) {
        final int TEMP;
        if(true){ TEMP=5;} else TEMP=6;
        System.out.println(TEMP);
        Director director = new Director();

        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());


        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Director may know several building recipes.
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }

}

