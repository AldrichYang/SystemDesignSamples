package memento.mementoMultiStateImpl;


/**
 * Created by yh on 10/11/18.
 */
public class Caretaker {
    //  备忘录对象
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
