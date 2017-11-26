package behavioral.chain;

/**
 * Created by GChidhambaranathan on 11/25/2017.
 */
public class ChainTest {
    public static void main(String[] args) {
        Chain c1 = new NegativeProcessor();
        Chain c2 = new ZeroProcessor();
        Chain c3 = new PositiveProcessor();

        c1.setNextChain(c2);
        c2.setNextChain(c3);

        c1.process(new Number(0));
    }
}
