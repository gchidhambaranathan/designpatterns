package behaviorial.abstractfactory;

import behaviorial.factory.Mac;
import behaviorial.factory.OS;

public class MacFactory implements OSAbstractFactory {
    @Override
    public OS getOS() {
        return new Mac();
    }
}
