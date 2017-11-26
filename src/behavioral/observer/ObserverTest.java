package behavioral.observer;

/**
 * Created by GChidhambaranathan on 11/25/2017.
 */
public class ObserverTest {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer observer = new BinaryObserver(subject);
        observer = new OctalObserver(subject);
        observer = new HexStringObserver(subject);

        subject.setState(15);
    }
}
