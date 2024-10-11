package operatingsystemsexample;

import operatingsystemsexample.abstractclass.OperatingSystem;
import operatingsystemsexample.factory.OperatingSystemFactory;

public class Driver {
    public static void main(String[] args) {
        OperatingSystemFactory osf = new OperatingSystemFactory();
        OperatingSystem winOS = osf.getOperatingSystem("WINDOWS" , "WIN7" ,"x64");
        System.out.println("First OS:");
        System.out.println(winOS.getType());
        System.out.println(winOS.getVersion());
        System.out.println(winOS.getArchitecture());

        OperatingSystem linOS = osf.getOperatingSystem("LINUX" , "UBUNTU" ,"AMR");
        System.out.println("Second OS:");
        System.out.println(linOS.getType());
        System.out.println(linOS.getVersion());
        System.out.println(linOS.getArchitecture());
    }

}
