package behavioral.template;

/**
 * Created by GChidhambaranathan on 11/25/2017.
 */
public abstract class Greeting {

    public abstract void select();

    public abstract void payment();

    public final void  giftWrap(boolean isWrap){
        if(isWrap){
            System.out.println("Item is gift wrapperd");
        }else {
            System.out.println("Item is not wrapped");
        }
    }

    public abstract void delivery();

    public final void processOrder(boolean isWrap){
        select();
        payment();
        giftWrap(isWrap);
        delivery();
    }
}
