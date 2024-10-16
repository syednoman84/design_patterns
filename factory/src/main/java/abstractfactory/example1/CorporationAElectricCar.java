package abstractfactory.example1;

public class CorporationAElectricCar implements ElectricVehicle {
    @Override
    public void build() {
        System.out.println("Future Vehicle Electric Car");
    }
}