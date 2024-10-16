package abstractfactory.example1;

public class CorporationB extends Corporation {
    @Override
    public MotorVehicle createMotorVehicle() {
        return new CorporationBMotorcycle();
    }

    @Override
    public ElectricVehicle createElectricVehicle() {
        return new CorporationBElectricCar();
    }
}