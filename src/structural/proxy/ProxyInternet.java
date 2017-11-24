package structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {
    private Internet internet = new RealInternet();
    private static List<String> bannedSites = new ArrayList<>();

    static {
        bannedSites.add("Vikatan");
        bannedSites.add("Facebook");
    }

    @Override
    public void connectToServer(String serverHost) throws Exception{
        if(bannedSites.contains(serverHost)){
            throw new Exception("This server is restricted");
        }

        internet.connectToServer(serverHost);
    }
}
