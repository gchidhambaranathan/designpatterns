package structural.decorator;

public class DecoratorTest {
    public static void main(String[] args) {

        Car car = new SportsCar(new BasicCar());
        car.assemble();

        Car spportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        spportsLuxuryCar.assemble();
    }
}
