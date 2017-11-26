package creational.abstractfactory;

import creational.factory.Linux;
import creational.factory.OS;

public class LinuxFactory implements OSAbstractFactory {
    @Override
    public OS getOS() {
        return new Linux();
    }
}
