package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by GChidhambaranathan on 11/25/2017.
 */
public class MediatorImpl implements Mediator {

    List<User> users = new ArrayList<>();
    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessagetoAll(String message, User user) {
        for(User user1 : this.users){
            if(user != user1){
                user1.recieveMessage(message);
            }
        }
    }
}
