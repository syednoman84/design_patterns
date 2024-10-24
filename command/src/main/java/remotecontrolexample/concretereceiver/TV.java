package remotecontrolexample.concretereceiver;

import remotecontrolexample.receiver.Device;

// Concrete receiver for a TV
public class TV implements Device {
    @Override
    public void turnOn() {
        System.out.println("TV is now on");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is now off");
    }

    public void changeChannel() {
        System.out.println("Channel changed");
    }
}