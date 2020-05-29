package chainOfResponsibility;

/**
 * Created by yh on 2018/7/21.
 */
public class Woman implements IWoman {

    //    1-未出嫁，2-出嫁，3-夫死
    private int type;
    private String request;

    public Woman(int type, String request) {
        this.type = type;
        this.request = request;
    }

    @Override
    public int getType() {
        return this.type;
    }

    @Override
    public String getRequest() {
        return this.request;
    }
}
