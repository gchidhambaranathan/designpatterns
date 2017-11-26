package behavioral.stratergy;

/**
 * Created by GChidhambaranathan on 11/25/2017.
 */
public class Context {
    private Stratergy stratergy;
    public Context(Stratergy stratergy){
        this.stratergy = stratergy;
    }

    public void executeStratergy(int num1, int num2){
        System.out.println(this.stratergy.doOperation(num1, num2));
    }
}
