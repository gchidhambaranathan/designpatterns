package behavioral.visitor;

public interface ItemElement {
    public int accept(ShoppingCartVisitor shoppingCartVisitor);
}
