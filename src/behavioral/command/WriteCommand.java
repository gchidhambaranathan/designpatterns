package behavioral.command;

/**
 * Created by GChidhambaranathan on 11/25/2017.
 */
public class WriteCommand implements Command {
    FileSystemReceiver fileSystemReceiver;

    public WriteCommand(FileSystemReceiver fileSystemReceiver){
        this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public void execute() {
        this.fileSystemReceiver.writeFile();
    }
}
