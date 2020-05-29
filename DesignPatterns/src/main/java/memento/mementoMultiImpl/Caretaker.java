package memento.mementoMultiImpl;


import memento.mementoMultiStateImpl.Memento;

import java.util.HashMap;

/**
 * Created by yh on 10/11/18.
 */
public class Caretaker {
    //  备忘录对象
    private HashMap<String, Memento> mementoMap = new HashMap<>();

    public Memento getMemento(String idx) {
        return mementoMap.get(idx);
    }

    public void setMemento(String idex, Memento memento) {
        mementoMap.put(idex, memento);
    }
}
