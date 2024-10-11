package factory.operatingsystemexample.abstractclassexample.vehicleabstractclass;

public abstract class OperatingSystem {
    private String  version;
    private String architecture;
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getArchitecture() {
        return architecture;
    }

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    public OperatingSystem(String type, String version, String architecture) {
        this.type = type;
        this.version = version;
        this.architecture = architecture;
    }

    public abstract void changeDir(String dir);
    public abstract void removeDir(String dir);
}
