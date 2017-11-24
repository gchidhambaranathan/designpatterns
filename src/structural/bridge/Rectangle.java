package structural.bridge;

public class Rectangle extends Shape {

    public Rectangle(Color color){
        super(color);
    }

    @Override
    void applyColor() {
        color.applyColor();
    }
}
