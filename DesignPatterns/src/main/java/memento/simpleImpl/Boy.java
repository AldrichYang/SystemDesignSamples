package memento.simpleImpl;

/**
 * Created by yh on 10/10/18.
 */
public class Boy {

    private String state = "";

    public void changeState() {
        this.state = "心情可能不好";
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
