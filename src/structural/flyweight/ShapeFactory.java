package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private static Map<String, Shape> shapeMap = new HashMap<>();

    public static Shape getShape(String key){
        Shape shape = null;
        if(shapeMap.containsKey(key)) {
            shape = shapeMap.get(key);
        }else {
            switch (key){
                case "circle":
                    System.out.println(" New circle Object created");
                    shape = new Circle();
                    break;
                case "rectangle":
                    System.out.println("New Rectangle object created");
                    shape = new Rectangle();
                    break;
                default:
                    System.out.println("Object not found");
                  break;
            }
            shapeMap.put(key,shape);
        }
        return shape;
    }
}
