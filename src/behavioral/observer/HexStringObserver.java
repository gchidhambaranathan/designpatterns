package behavioral.observer;

/**
 * Created by GChidhambaranathan on 11/25/2017.
 */
public class HexStringObserver extends Observer {

    public HexStringObserver(Subject subject){
        this.subject = subject;
        this.subject.registerObserver(this);
    }


    @Override
    public void update() {
        System.out.println("Hex String "+ Integer.toHexString(this.subject.getState()));
    }
}
