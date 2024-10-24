package remotecontrolexample.concretecommand;

import remotecontrolexample.command.Command;
import remotecontrolexample.receiver.Device;

// Concrete command for turning a device off
public class TurnOffCommand implements Command {
    private Device device;

    public TurnOffCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOff();
    }
}
