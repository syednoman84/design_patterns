package factory.operatingsystemexample.interfaceexample.products;

import factory.operatingsystemexample.interfaceexample.osinterface.OperatingSystem;

public class WindowsOperatingSysten implements OperatingSystem {

    private final String type;
    private final String version;
    private final String architecture;

    public WindowsOperatingSysten(String type, String version, String architecture) {
        this.type = type;
        this.version = version;
        this.architecture = architecture;
    }

    @Override
    public void buildOperatingSystem() {
        System.out.println("Windows Operating System Built with: " + type + " " + version + " " + architecture);
    }

    public String getType() {
        return type;
    }

    public String getVersion() {
        return version;
    }

    public String getArchitecture() {
        return architecture;
    }
}

