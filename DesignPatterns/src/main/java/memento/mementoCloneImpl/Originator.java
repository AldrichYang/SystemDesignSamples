package memento.mementoCloneImpl;

/**
 * Created by yh on 10/11/18.
 */
public class Originator implements Cloneable {

    private Originator backup;
    //    内部状态
    private String state = "";

    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException cnse) {

        }
        return null;

    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void createMemento() {
        backup = (Originator) this.clone();
    }

    public void restoreMemento() {
        this.setState(backup.getState());
    }
}
