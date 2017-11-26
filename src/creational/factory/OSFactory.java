package creational.factory;

public class OSFactory {

    public static OS getInstance(String osType){
        if(osType.equals("Win")){
            return new Windows();
        }else if(osType.equals("Linux")){
            return new Linux();
        }else if(osType.equals("Mac")){
            return new Mac();
        }
        return null;
    }
}
