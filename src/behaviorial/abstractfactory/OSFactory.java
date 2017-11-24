package behaviorial.abstractfactory;

import behaviorial.factory.OS;

public class OSFactory {

    public static OS getOS(OSAbstractFactory osAbstractFactory){
        return osAbstractFactory.getOS();
    }
}
