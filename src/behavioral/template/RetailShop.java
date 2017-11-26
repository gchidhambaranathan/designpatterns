package behavioral.template;

/**
 * Created by GChidhambaranathan on 11/25/2017.
 */
public class RetailShop extends Greeting {
    @Override
    public void select() {
        System.out.println("Selected in shop");
    }

    @Override
    public void payment() {
        System.out.println("payment by cash/POS");
    }

    @Override
    public void delivery() {
        System.out.println("Delivered at counter");
    }
}
