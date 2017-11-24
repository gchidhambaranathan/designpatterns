package behaviorial.factory;

public class Mac implements OS {
    @Override
    public String getName() {
        return "Mac";
    }

    @Override
    public String getVersion() {
        return "9.0";
    }

    @Override
    public String getArch() {
        return "X64";
    }
}
