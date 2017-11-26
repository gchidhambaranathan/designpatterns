package behavioral.command;

/**
 * Created by GChidhambaranathan on 11/25/2017.
 */
public class UnixFileSystemReceiver implements FileSystemReceiver {
    @Override
    public void openFile() {
        System.out.println("Unix: Open File");
    }

    @Override
    public void writeFile() {
        System.out.println("Unix: write File");
    }

    @Override
    public void closeFile() {
        System.out.println("Unix: close File");
    }
}
