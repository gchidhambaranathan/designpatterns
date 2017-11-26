package behavioral.command;

/**
 * Created by GChidhambaranathan on 11/25/2017.
 */
public class CloseCommand implements Command {
    FileSystemReceiver fileSystemReceiver;

    public CloseCommand(FileSystemReceiver fileSystemReceiver){
        this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public void execute() {
        this.fileSystemReceiver.closeFile();
    }
}
