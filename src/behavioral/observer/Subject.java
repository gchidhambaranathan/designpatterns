package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by GChidhambaranathan on 11/25/2017.
 */
public class Subject {
    private int state;
    private List<Observer> observers = new ArrayList<>();

    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }

    public int getState() {
        return state;
    }

    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    public void unRegisterObserver(Observer observer){
        observers.remove(observer);
    }

    private void notifyObservers(){
        for(Observer observer : observers){
            observer.update();
        }
    }


}
