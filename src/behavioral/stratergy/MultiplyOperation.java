package behavioral.stratergy;

/**
 * Created by GChidhambaranathan on 11/25/2017.
 */
public class MultiplyOperation implements Stratergy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
