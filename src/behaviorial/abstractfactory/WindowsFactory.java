package behaviorial.abstractfactory;

import behaviorial.factory.OS;
import behaviorial.factory.Windows;

public class WindowsFactory implements OSAbstractFactory {
    @Override
    public OS getOS() {
        return new Windows();
    }
}
