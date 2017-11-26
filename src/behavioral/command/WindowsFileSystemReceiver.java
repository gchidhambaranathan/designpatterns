package behavioral.command;

/**
 * Created by GChidhambaranathan on 11/25/2017.
 */
public class WindowsFileSystemReceiver implements FileSystemReceiver {
    @Override
    public void openFile() {
        System.out.println("Windows: Open File");
    }

    @Override
    public void writeFile() {
        System.out.println("Windows: write File");
    }

    @Override
    public void closeFile() {
        System.out.println("Windows: close File");
    }
}
