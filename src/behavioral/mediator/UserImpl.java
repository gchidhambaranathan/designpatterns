package behavioral.mediator;

/**
 * Created by GChidhambaranathan on 11/25/2017.
 */
public class UserImpl extends User {
    public UserImpl(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void sendMessage(String message) {
        this.mediator.sendMessagetoAll(message,this);
    }

    @Override
    public void recieveMessage(String message) {
        System.out.println(this.name + " received message " + message);
    }
}
