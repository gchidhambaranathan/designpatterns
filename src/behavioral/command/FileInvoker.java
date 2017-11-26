package behavioral.command;

/**
 * Created by GChidhambaranathan on 11/25/2017.
 */
public class FileInvoker {
    private Command command;

    public  FileInvoker(Command command){
        this.command = command;
    }

    public void execute(){
        this.command.execute();
    }
}
