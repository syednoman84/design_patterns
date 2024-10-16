package factory.operatingsystemexample.interfaceexample.products;

import factory.operatingsystemexample.interfaceexample.osinterface.OperatingSystem;

public class LinuxOperatingSystem implements OperatingSystem {

    private final String type;
    private final String version;
    private final String architecture;

    public LinuxOperatingSystem(String type, String version, String architecture) {
        this.type = type;
        this.version = version;
        this.architecture = architecture;
    }

    @Override
    public void buildOperatingSystem() {
        System.out.println("Linux Operating System Built with: " + type + " " + version + " " + architecture);
    }

}
