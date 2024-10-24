package remotecontrolexample.concretecommand;

import remotecontrolexample.command.Command;
import remotecontrolexample.receiver.Device;

// Concrete command for turning a device on
public class TurnOnCommand implements Command {
    private Device device;

    public TurnOnCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOn();
    }
}
