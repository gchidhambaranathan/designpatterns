package behavioral.interpreter;

public class TerminalExpression implements Expression{
    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }
    @Override
    public boolean interpret(String con) {
        return con.contains(data);
    }
}
