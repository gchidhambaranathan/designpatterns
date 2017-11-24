package behaviorial.factory;

public class Windows implements OS {
    @Override
    public String getName() {
        return "Windows";
    }

    @Override
    public String getVersion() {
        return "10";
    }

    @Override
    public String getArch() {
        return "X64";
    }
}
