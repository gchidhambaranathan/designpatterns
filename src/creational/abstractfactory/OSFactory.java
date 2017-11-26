package creational.abstractfactory;

import creational.factory.OS;

public class OSFactory {

    public static OS getOS(OSAbstractFactory osAbstractFactory){
        return osAbstractFactory.getOS();
    }
}
