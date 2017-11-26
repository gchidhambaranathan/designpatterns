package behavioral.chain;

/**
 * Created by GChidhambaranathan on 11/25/2017.
 */
public interface Chain {

    public void setNextChain(Chain chain);
    public void process(Number number);
}
