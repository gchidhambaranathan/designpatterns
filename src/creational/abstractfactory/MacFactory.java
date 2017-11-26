package creational.abstractfactory;

import creational.factory.Mac;
import creational.factory.OS;

public class MacFactory implements OSAbstractFactory {
    @Override
    public OS getOS() {
        return new Mac();
    }
}
