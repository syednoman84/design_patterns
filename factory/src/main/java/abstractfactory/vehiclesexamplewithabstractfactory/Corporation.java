package abstractfactory.vehiclesexamplewithabstractfactory;

public abstract class Corporation {

    public abstract MotorVehicle createMotorVehicle();

    public abstract ElectricVehicle createElectricVehicle();
}