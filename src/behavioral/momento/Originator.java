package behavioral.momento;

/**
 * Created by GChidhambaranathan on 1/12/2018.
 */
public class Originator {
    private String state;

    public Originator(String state){
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Momento saveToMemento(){
        return  new Momento(this.state);
    }

    public void restoreState(Momento momento){
        this.state = momento.getState();
    }
}
