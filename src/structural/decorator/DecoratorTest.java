package structural.decorator;

public class DecoratorTest {
    public static void main(String[] args) {

        Car car = new SportsCarDecorator(new BasicCar());
        car.assemble();

        Car spportsLuxuryCar = new SportsCarDecorator(new LuxuryCarDecorator(new BasicCar()));
        spportsLuxuryCar.assemble();
    }
}
