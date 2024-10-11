package operatingsystemsexample.products;

import operatingsystemsexample.abstractclass.OperatingSystem;

public class WindowsOperatingSysten extends OperatingSystem {
    public WindowsOperatingSysten(String type, String version, String architecture) {
        super(type, version,architecture);
    }

    @Override
    public void changeDir(String dir) {
        //Windows command
    }

    @Override
    public void removeDir(String dir) {
        //Windows command
    }
}
