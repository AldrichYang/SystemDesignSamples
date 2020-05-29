package memento.mementoImpl1;

/**
 * Created by yh on 10/11/18.
 */
public class Memento {

    private String state = "";

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
