package behavioral.chain;

/**
 * Created by GChidhambaranathan on 11/25/2017.
 */
public class PositiveProcessor implements Chain {
    private Chain nextChain;
    @Override
    public void setNextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void process(Number number) {
        if(number.getNumber() > 0){
            System.out.println("This is positive number");
        }else {
            if(this.nextChain != null){
                System.out.println("This is not positive.Delegating ");
                nextChain.process(number);
            }
        }
    }
}
