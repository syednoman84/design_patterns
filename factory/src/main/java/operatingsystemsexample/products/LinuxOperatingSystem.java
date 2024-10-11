package operatingsystemsexample.products;

import operatingsystemsexample.abstractclass.OperatingSystem;

public class LinuxOperatingSystem extends OperatingSystem {

    public LinuxOperatingSystem(String type, String version, String architecture) {
        super(type, version, architecture);
    }

    @Override
    public void changeDir(String dir) {

    }

    @Override
    public void removeDir(String dir) {

    }
}
