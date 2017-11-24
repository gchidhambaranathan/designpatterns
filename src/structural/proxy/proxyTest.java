package structural.proxy;

public class proxyTest {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();
        try {
            internet.connectToServer("Google");
            internet.connectToServer("Facebook");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
