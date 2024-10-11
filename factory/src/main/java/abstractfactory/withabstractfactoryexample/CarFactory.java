package abstractfactory.withabstractfactoryexample;

// Abstract Factory Interface
interface CarFactory {
    Car createCar();
    CarSpecification createSpecification();
}
