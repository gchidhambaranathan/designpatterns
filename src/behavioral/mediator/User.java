package behavioral.mediator;

/**
 * Created by GChidhambaranathan on 11/25/2017.
 */
public abstract class User {
    protected Mediator mediator;
    protected String name;

    public User(Mediator mediator , String name){
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void sendMessage(String message);

    public abstract void recieveMessage(String message);
}
