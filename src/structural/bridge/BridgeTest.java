package structural.bridge;

public class BridgeTest {
    public static void main(String[] args) {
        Shape shape = new Circle(new RedColor());
        shape.applyColor();

        shape = new Rectangle(new BlueColor());
        shape.applyColor();
    }
}
