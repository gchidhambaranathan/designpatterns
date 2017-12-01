package behavioral.interpreter;

public class InterpreterTest {
    public static void main(String[] args) {
        Expression chida = new TerminalExpression("chida");
        Expression varada = new TerminalExpression("varada");

        Expression andExpr = new AndExpression(chida,varada);
        System.out.println(andExpr.interpret("chida,varada"));
        System.out.println(andExpr.interpret("chida,mani"));

        Expression orExpr = new OrExpression(chida,varada);
        System.out.println(orExpr.interpret("chida"));
        System.out.println(orExpr.interpret("varada"));
        System.out.println(orExpr.interpret("mani"));

    }
}
