package structural.flyweight;

public class FlyWeightTest {
    public static void main(String[] args) {
        Shape shape = ShapeFactory.getShape("circle");
        shape.draw();

        shape = ShapeFactory.getShape("rectangle");
        shape.draw();

        shape = ShapeFactory.getShape("circle");
        shape.draw();

        shape = ShapeFactory.getShape("rectangle");
        shape.draw();
    }
}
