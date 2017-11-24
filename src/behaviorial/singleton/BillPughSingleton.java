package behaviorial.singleton;

public class BillPughSingleton {

    private BillPughSingleton(){

    }

    private static class LazyHolder {
        private static final BillPughSingleton instance = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return LazyHolder.instance;
    }
}
