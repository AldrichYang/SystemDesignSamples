package memento.mementoImpl1;

/**
 * Created by yh on 10/11/18.
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

    public Memento createMemento() {
        return new Memento(this.state);
    }

    public void restoreMemento(Memento _memento) {
        this.setState(_memento.getState());
    }


}
