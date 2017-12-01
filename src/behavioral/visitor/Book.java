package behavioral.visitor;

public class Book implements ItemElement {

    private int isbnNumber;
    private int price;

    public Book(int isbnNumber, int price){
        this.price = price;
        this.isbnNumber = isbnNumber;
    }


    public int getIsbnNumber() {
        return isbnNumber;
    }


    public int getPrice() {
        return price;
    }


    @Override
    public int accept(ShoppingCartVisitor shoppingCartVisitor) {
        return shoppingCartVisitor.visit(this);
    }
}
