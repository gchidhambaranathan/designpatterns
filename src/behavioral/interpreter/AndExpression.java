package behavioral.interpreter;

public class AndExpression implements Expression{
    private Expression expression1;
    private Expression expression2;

    public AndExpression(Expression expression1, Expression expression2){
        this.expression1 = expression1;
        this.expression2 = expression2;
    }


    @Override
    public boolean interpret(String con) {
        return this.expression1.interpret(con) && this.expression2.interpret(con);
    }
}
