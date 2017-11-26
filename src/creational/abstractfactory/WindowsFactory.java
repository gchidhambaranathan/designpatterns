package creational.abstractfactory;

import creational.factory.OS;
import creational.factory.Windows;

public class WindowsFactory implements OSAbstractFactory {
    @Override
    public OS getOS() {
        return new Windows();
    }
}
