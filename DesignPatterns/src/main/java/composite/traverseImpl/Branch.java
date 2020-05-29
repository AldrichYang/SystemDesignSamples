package composite.traverseImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yh on 9/7/18.
 */
public class Branch extends Corp {
    List<Corp> subordinateList = new ArrayList<>();

    public Branch(String _name, String _position, int _salary) {
        super(_name, _position, _salary);
    }

    //    增加一个下属，可能是树枝，也可能是叶子
    public void addSubordinate(Corp corp) {
        corp.setParent(this);
        subordinateList.add(corp);
    }

    public List<Corp> getSubordinate() {
        return subordinateList;
    }


}
