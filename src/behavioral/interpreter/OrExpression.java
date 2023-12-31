package behavioral.interpreter;

public class OrExpression implements Expression{
    private Expression expression1;
    private Expression expression2;

    public OrExpression(Expression expression1, Expression expression2){
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpret(String con) {
        return this.expression1.interpret(con) || expression2.interpret(con);
    }
}
