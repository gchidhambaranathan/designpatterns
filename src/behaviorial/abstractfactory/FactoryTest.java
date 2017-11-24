package behaviorial.abstractfactory;


import behaviorial.factory.OS;

public class FactoryTest {
    public static void main(String[] args) {
        OS os = OSFactory.getOS(new WindowsFactory());

        System.out.println(os.getName());

        os = OSFactory.getOS(new LinuxFactory());

        System.out.println(os.getName());

        os = OSFactory.getOS(new MacFactory());

        System.out.println(os.getName());
    }
}
