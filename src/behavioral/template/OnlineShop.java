package behavioral.template;

/**
 * Created by GChidhambaranathan on 11/25/2017.
 */
public class OnlineShop extends Greeting {
    @Override
    public void select() {
        System.out.println("Added to cart");
    }

    @Override
    public void payment() {
        System.out.println("Payment by Credit/Debit card/ Net banking");
    }

    @Override
    public void delivery() {
        System.out.println("Delivered by DHL courier");
    }
}
