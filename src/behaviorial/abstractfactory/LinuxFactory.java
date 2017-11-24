package behaviorial.abstractfactory;

import behaviorial.factory.Linux;
import behaviorial.factory.OS;

public class LinuxFactory implements OSAbstractFactory {
    @Override
    public OS getOS() {
        return new Linux();
    }
}
