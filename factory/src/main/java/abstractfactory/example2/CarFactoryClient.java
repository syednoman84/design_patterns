package abstractfactory.example2;

// Reference: https://www.geeksforgeeks.org/abstract-factory-pattern/

/*
    Components of Abstract Factory Pattern

    1. Abstract Factory
    Abstract Factory serves as a high-level blueprint that defines a set of rules for creating families
    of related objects without specifying their concrete classes.
    It declares a series of methods, each responsible for creating a particular type of object and
    ensures that concrete factories adhere to a common interface, providing a consistent way to produce
    related sets of objects.

    2. Concrete Factories
    Concrete Factories implement the rules specified by the abstract factory.
    It contain the logic for creating specific instances of objects within a family.
    Also multiple concrete factories can exist, each tailored to produce a distinct family of related
    objects.

    3. Abstract Products
    Abstract Products represents a family of related objects by defining a set of common methods or
    properties. It acts as an abstract or interface type that all concrete products within a family
    must adhere to and provides a unified way for concrete products to be used interchangeably.

    4. Concrete Products
    They are the actual instances of objects created by concrete factories.
    They implement the methods declared in the abstract products, ensuring consistency within a family
    and belong to a specific category or family of related objects.

    5. Client
    Client utilizes the abstract factory to create families of objects without specifying their concrete
    types and interacts with objects through abstract interfaces provided by abstract products.
    Client enjoys the flexibility of seamlessly switching between families of objects by changing the
    concrete factory instance.
*/

/*
    Abstract Factory example
    Imagine you’re managing a global car manufacturing company. You want to design a system to create cars
    with specific configurations for different regions, such as North America and Europe.
    Each region may have unique requirements and regulations, and you want to ensure that cars produced
    for each region meet those standards.


    What can be the challenges while implementing this system?

    -   One challenge can be designing cars with specific features and configurations for different regions.
    -   The other main challenge is to ensure consistency in the production of cars and their specifications
        within each region.
    -   Adapting the system to changes in regulations or introducing new features for a specific region
        becomes challenging. Modifications would need to be made in multiple places,
        increasing the chances of introducing bugs and making the system more prone to errors.

    How Abstract Factory Pattern help to solve above challenges?

    -   The abstract factory ensures that each region has its concrete factory, responsible for creating
        cars and specifications consistent with the local market requirements.
        This promotes consistency in the design and features of the vehicles produced for each region.

    -   Each concrete factory encapsulates the logic for creating cars and specifications specific to a region.
        This isolation allows you to make changes or introduce new features for a particular region without
        affecting the rest of the system. For example, if regulations change in North America, you can modify
        the NorthAmericaCarFactory without impacting the EuropeCarFactor.

    -   Adding support for a new region involves creating a new concrete factory for that region.
        This expansion can be done without modifying existing code, providing a scalable and modular
        solution.
        The pattern promotes a clear separation between the creation of products (cars and specifications) and their actual use.
*/

// Client Code
public class CarFactoryClient {
    public static void main(String[] args) {
        // Creating cars for North America
        CarFactory northAmericaFactory = new NorthAmericaCarFactory();
        Car northAmericaCar = northAmericaFactory.createCar();
        CarSpecification northAmericaSpec = northAmericaFactory.createSpecification();
        northAmericaCar.assemble();
        northAmericaSpec.display();

        // Creating cars for Europe
        CarFactory europeFactory = new EuropeCarFactory();
        Car europeCar = europeFactory.createCar();
        CarSpecification europeSpec = europeFactory.createSpecification();
        europeCar.assemble();
        europeSpec.display();
    }
}
