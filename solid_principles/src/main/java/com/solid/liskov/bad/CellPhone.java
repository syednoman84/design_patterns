package com.solid.liskov.bad;

public class CellPhone extends Device{

    /*
        Notice here that CellPhone class is overriding callBaba method but marking it as Unsupported
        This means it is changing the behavior of this method as compared to its super class Device.
        This breaks LSP.
    */
    @Override
    public void callBaba() {
        System.out.println("Unsupported Method");
    }
}
