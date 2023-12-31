package behavioral.visitor;

public class Fruit implements ItemElement{

    private int pricePerKg;
    private int weight;
    private String name;

    public Fruit(String name, int pricePerKg, int weight){
        this.pricePerKg = pricePerKg;
        this.weight = weight;
        this.name = name;
    }

    public int getPricePerKg() {
        return pricePerKg;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    @Override
    public int accept(ShoppingCartVisitor shoppingCartVisitor) {
        return shoppingCartVisitor.visit(this);
    }
}
