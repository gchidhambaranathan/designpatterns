package behavioral.template;

/**
 * Created by GChidhambaranathan on 11/25/2017.
 */
public class TemplateTest {
    public static void main(String[] args) {
        Greeting greeting = new OnlineShop();
        greeting.processOrder(false);

        greeting = new RetailShop();
        greeting.processOrder(true);
    }
}
