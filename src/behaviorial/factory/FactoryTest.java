package behaviorial.factory;

public class FactoryTest {
    public static void main(String[] args) {
        OS os = OSFactory.getInstance("Win");

        System.out.println(os.getName());

        os = OSFactory.getInstance("Linux");

        System.out.println(os.getName());

        os = OSFactory.getInstance("Mac");

        System.out.println(os.getName());
    }
}
