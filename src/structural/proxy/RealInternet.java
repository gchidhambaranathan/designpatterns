package structural.proxy;

public class RealInternet implements Internet {
    @Override
    public void connectToServer(String serverHost) throws Exception {
        System.out.println("Connecting to host " + serverHost);
    }
}
