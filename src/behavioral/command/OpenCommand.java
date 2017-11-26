package behavioral.command;

/**
 * Created by GChidhambaranathan on 11/25/2017.
 */
public class OpenCommand implements Command {
    FileSystemReceiver fileSystemReceiver;

    public OpenCommand(FileSystemReceiver fileSystemReceiver){
        this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public void execute() {
        this.fileSystemReceiver.openFile();
    }
}
