package creational.singleton;

public class EagerSingletonStaticBlock {
    private static EagerSingletonStaticBlock instance;

    private EagerSingletonStaticBlock(){

    }

    static {
        try {
            instance = new EagerSingletonStaticBlock();
        }catch (Exception e){
            System.out.println("Exception creating instance");
        }
    }

    public static EagerSingletonStaticBlock getInstance(){
        return instance;
    }
}
