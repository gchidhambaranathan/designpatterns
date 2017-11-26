package behavioral.command;

/**
 * Created by GChidhambaranathan on 11/25/2017.
 */
public class CommandTest {
    public static void main(String[] args) {
        FileSystemReceiver fileSystemReceiver = FileSystemReceiverUtil.getUnderlyingFileSystem();

        OpenCommand openCommand = new OpenCommand(fileSystemReceiver);

        FileInvoker fileInvoker = new FileInvoker(openCommand);

        fileInvoker.execute();

        WriteCommand writeCommand = new WriteCommand(fileSystemReceiver);

        fileInvoker = new FileInvoker(writeCommand);

        fileInvoker.execute();

        CloseCommand closeCommand = new CloseCommand(fileSystemReceiver);

        fileInvoker = new FileInvoker(closeCommand);

        fileInvoker.execute();
    }
}
