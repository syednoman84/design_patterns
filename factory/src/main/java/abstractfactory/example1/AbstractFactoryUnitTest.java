package abstractfactory.example1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class AbstractFactoryUnitTest {
    @Test
    public void givenFutureVehicleFactory_whenCreateMotorVehicle_thenInstanceOf() {
        Corporation corporation = new CorporationA();
        MotorVehicle motorVehicle = corporation.createMotorVehicle();
        assertThat(motorVehicle).isInstanceOf(MotorVehicle.class);
        assertThat(motorVehicle).isInstanceOf(CorporationAMotorcycle.class);
    }

    @Test
    public void givenFutureVehicleFactory_whenCreateElectricVehicle_thenInstanceOf() {
        Corporation corporation = new CorporationA();
        ElectricVehicle electricVehicle = corporation.createElectricVehicle();
        assertThat(electricVehicle).isInstanceOf(ElectricVehicle.class);
        assertThat(electricVehicle).isInstanceOf(CorporationAElectricCar.class);
    }

    @Test
    public void givenNextGenFactory_whenCreateMotorVehicle_thenInstanceOf() {
        Corporation corporation = new CorporationB();
        MotorVehicle motorVehicle = corporation.createMotorVehicle();
        assertThat(motorVehicle).isInstanceOf(MotorVehicle.class);
        assertThat(motorVehicle).isInstanceOf(CorporationBMotorcycle.class);
    }

    @Test
    public void givenNextGenFactory_whenCreateElectricVehicle_thenInstanceOf() {
        Corporation corporation = new CorporationB();
        ElectricVehicle electricVehicle = corporation.createElectricVehicle();
        assertThat(electricVehicle).isInstanceOf(ElectricVehicle.class);
        assertThat(electricVehicle).isInstanceOf(CorporationBElectricCar.class);
    }
}