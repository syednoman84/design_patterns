package abstractfactory.example1;

public class CorporationA extends Corporation {
    @Override
    public MotorVehicle createMotorVehicle() {
        return new CorporationAMotorcycle();
    }

    @Override
    public ElectricVehicle createElectricVehicle() {
        return new CorporationAElectricCar();
    }
}