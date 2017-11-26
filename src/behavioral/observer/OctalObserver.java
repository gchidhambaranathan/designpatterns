package behavioral.observer;



/**
 * Created by GChidhambaranathan on 11/25/2017.
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.registerObserver(this);
    }


    @Override
    public void update() {
        System.out.println("Octal String "+ Integer.toOctalString(this.subject.getState()));
    }
}
