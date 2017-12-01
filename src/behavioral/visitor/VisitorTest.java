package behavioral.visitor;

public class VisitorTest {
    public static void main(String[] args) {
        ItemElement[] items = new ItemElement[]{new Book(12345, 100),new Fruit("Apple",150, 3),
                new Fruit("Bananna", 50,3)};
        int totalAmount = calulateTotal(items);
        System.out.println(totalAmount);
    }

    private static int calulateTotal(ItemElement[] items) {
        ShoppingCartVisitor shoppingCartVisitor = new ShoppingCartVisitorImpl();
        int sum = 0;
        for(ItemElement itemElement : items){
            sum+= itemElement.accept(shoppingCartVisitor);
        }
        return sum;
    }
}
