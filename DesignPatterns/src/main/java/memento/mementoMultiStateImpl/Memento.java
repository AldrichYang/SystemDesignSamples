package memento.mementoMultiStateImpl;

import java.util.HashMap;

/**
 * Created by yh on 10/11/18.
 */
public class Memento {

    private HashMap<String, Object> stateMap;

    //    接受一个对象，建立一个备份
    public Memento(HashMap<String, Object> stateMap) {
        this.stateMap = stateMap;
    }

    public HashMap<String, Object> getStateMap() {
        return stateMap;
    }

    public void setStateMap(HashMap<String, Object> stateMap) {
        this.stateMap = stateMap;
    }
}
