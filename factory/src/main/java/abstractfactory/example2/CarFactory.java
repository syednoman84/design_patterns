package abstractfactory.example2;

// Abstract Factory Interface
interface CarFactory {
    Car createCar();
    CarSpecification createSpecification();
}
