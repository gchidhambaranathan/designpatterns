package creational.factory;

public class Linux implements OS {
    @Override
    public String getName() {
        return "Ubuntu";
    }

    @Override
    public String getVersion() {
        return "16.04";
    }

    @Override
    public String getArch() {
        return "i386";
    }
}
