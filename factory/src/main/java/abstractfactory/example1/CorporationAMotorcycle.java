package abstractfactory.example1;

public class CorporationAMotorcycle implements MotorVehicle {
    @Override
    public void build() {
        System.out.println("Future Vehicle Motorcycle");
    }
}