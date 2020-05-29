package memento.mementoReadOnlyImpl;

/**
 * Created by yh on 10/12/18.
 */
public class Originator {

    private String state = "";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    //    创建一个备忘录
    public Memento createMemento() {
        return new Memento(this.state);
    }

    //    恢复一个备忘录
    public void restoreMemento(Memento memento) {
        this.setState(memento.getState());
    }

    private class Memento implements IMemento {
        private String state = "";

        private Memento(String state) {
            this.state = state;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }
    }
}
