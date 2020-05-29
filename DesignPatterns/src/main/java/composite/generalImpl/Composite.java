package composite.generalImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yh on 9/7/18.
 */
public class Composite extends Component {
    private List<Component> componentList = new ArrayList<>();

    //    增加一个叶子构件或者树枝构件
    public void add(Component component) {
        componentList.add(component);
    }

    //删除一个叶子构件或树枝构件
    public void remove(Component component) {
        componentList.remove(component);
    }

    //    获得分支下的所有叶子构件和树枝构件
    public List<Component> getChildren() {
        return componentList;
    }


}
