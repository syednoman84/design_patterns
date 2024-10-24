package remotecontrolexample.concretecommand;

import remotecontrolexample.command.Command;
import remotecontrolexample.concretereceiver.Stereo;

// Concrete command for adjusting the volume of a stereo
public class AdjustVolumeCommand implements Command {
    private Stereo stereo;

    public AdjustVolumeCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.adjustVolume();
    }
}

