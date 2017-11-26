package behavioral.stratergy;

/**
 * Created by GChidhambaranathan on 11/25/2017.
 */
public class StratergyTest {
    public static void main(String[] args) {
        Stratergy stratergy = new AddOperation();
        Context context = new Context(stratergy);
        context.executeStratergy(10,5);

        stratergy = new SubstractOperation();
        context = new Context(stratergy);
        context.executeStratergy(10,5);

        stratergy = new MultiplyOperation();
        context = new Context(stratergy);
        context.executeStratergy(10,5);
    }
}
