package observer;

/**
 * Created by yh on 17/7/31.
 */
public class Client {
    public static void main(String[] args){
        WhoIsObservable helloObservable = new WhoIsObservable();
        helloObservable.init();
        helloObservable.tellWorld();
    }
}
