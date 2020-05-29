package memento.mementoImpl2;

import memento.mementoImpl1.Memento;

/**
 * Created by yh on 10/11/18.
 */
public class Caretaker {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
