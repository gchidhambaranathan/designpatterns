package behavioral.observer;

/**
 * Created by GChidhambaranathan on 11/25/2017.
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
