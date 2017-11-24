package behaviorial.behaviorial.singleton;

public class EgerSingleton {

    private static EgerSingleton egerSingleton = new EgerSingleton();


    private EgerSingleton(){

    }

    public static EgerSingleton getInstance(){
        return egerSingleton;
    }

}
