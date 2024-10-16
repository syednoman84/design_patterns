package factory.operatingsystemexample;

import factory.operatingsystemexample.abstractclassexample.osabstractclass.OperatingSystem;
import factory.operatingsystemexample.abstractclassexample.factory.OperatingSystemFactory;

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

        factory.operatingsystemexample.interfaceexample.factory.OperatingSystemFactory osf1 = new factory.operatingsystemexample.interfaceexample.factory.OperatingSystemFactory();
        factory.operatingsystemexample.interfaceexample.osinterface.OperatingSystem winOS1 = osf1.getOperatingSystem("WINDOWS" , "WIN9" ,"x664");
        System.out.println("Third OS:");
        winOS1.buildOperatingSystem();

        factory.operatingsystemexample.interfaceexample.osinterface.OperatingSystem linOS2 = osf1.getOperatingSystem("LINUX" , "TEMP" ,"ARM2");
        System.out.println("Fourth OS:");
        linOS2.buildOperatingSystem();
    }

}
