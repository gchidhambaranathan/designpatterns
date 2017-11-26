package behavioral.mediator;

/**
 * Created by GChidhambaranathan on 11/25/2017.
 */
public interface Mediator {

    public void addUser(User user);

    public void sendMessagetoAll(String message, User user);
}
