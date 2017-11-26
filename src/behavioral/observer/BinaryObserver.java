package behavioral.observer;

/**
 * Created by GChidhambaranathan on 11/25/2017.
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.registerObserver(this);
    }


    @Override
    public void update() {
        System.out.println("Binary String "+ Integer.toBinaryString(this.subject.getState()));
    }
}
