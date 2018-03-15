package behavioral.momento;

/**
 * Created by GChidhambaranathan on 1/12/2018.
 */
public class Test {
    public static void main(String[] args) {
        Originator originator = new Originator("State1");
        Momento momento = originator.saveToMemento();
        originator.setState("State2");
        System.out.println(originator.getState());
        originator.restoreState(momento);
        System.out.println(originator.getState());
    }
}
