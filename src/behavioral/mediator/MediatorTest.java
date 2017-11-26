package behavioral.mediator;

/**
 * Created by GChidhambaranathan on 11/25/2017.
 */
public class MediatorTest {
    public static void main(String[] args) {
        Mediator mediator = new MediatorImpl();

        User user1 = new UserImpl(mediator,"Chida");
        User user2 = new UserImpl(mediator,"Varada");
        User user3 = new UserImpl(mediator,"Mani");
        User user4 = new UserImpl(mediator,"Karthik");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.sendMessage("Hi All");
    }
}
