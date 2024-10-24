package remotecontrolexample;

import remotecontrolexample.command.Command;
import remotecontrolexample.concretecommand.AdjustVolumeCommand;
import remotecontrolexample.concretecommand.ChangeChannelCommand;
import remotecontrolexample.concretecommand.TurnOffCommand;
import remotecontrolexample.concretecommand.TurnOnCommand;
import remotecontrolexample.concretereceiver.Stereo;
import remotecontrolexample.concretereceiver.TV;
import remotecontrolexample.invoker.RemoteControl;

// Example usage
public class Driver {
    public static void main(String[] args) {
        // Create devices
        TV tv = new TV();
        Stereo stereo = new Stereo();

        // Create command objects
        Command turnOnTVCommand = new TurnOnCommand(tv);
        Command turnOffTVCommand = new TurnOffCommand(tv);
        Command adjustVolumeStereoCommand = new AdjustVolumeCommand(stereo);
        Command changeChannelTVCommand = new ChangeChannelCommand(tv);

        // Create remote control
        RemoteControl remote = new RemoteControl();

        // Set and execute commands
        remote.setCommand(turnOnTVCommand);
        remote.pressButton(); // Outputs: TV is now on

        remote.setCommand(adjustVolumeStereoCommand);
        remote.pressButton(); // Outputs: Volume adjusted

        remote.setCommand(changeChannelTVCommand);
        remote.pressButton(); // Outputs: Channel changed

        remote.setCommand(turnOffTVCommand);
        remote.pressButton(); // Outputs: TV is now off
    }
}