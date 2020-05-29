package composite.transparentImpl;

import java.util.List;

/**
 * Created by yh on 9/7/18.
 */
public abstract class Component {

    //    个体和整体都有的功能
    public void doSth() {

    }

    //    增加一个叶子构件或者树枝构件
    public abstract void add(Component component);

    //删除一个叶子构件或树枝构件
    public abstract void remove(Component component);

    //    获得分支下的所有叶子构件和树枝构件
    public abstract List<Component> getChildren();
}
