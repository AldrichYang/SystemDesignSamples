package composite.traverseImpl;

import com.google.common.base.MoreObjects;

/**
 * Created by yh on 9/7/18.
 */
public abstract class Corp {
    //    姓名
    private String name;
    //    位置
    private String position;
    //    薪水
    private int salary;
    //父节点
    private Corp parent;

    public Corp(String _name, String _position, int _salary) {
        this.name = _name;
        this.position = _position;
        this.salary = _salary;
    }

    public Corp getParent() {
        return parent;
    }

    public void setParent(Corp parent) {
        this.parent = parent;
    }

    public String getInfo() {
        return MoreObjects.toStringHelper(this).add("name:", name).add("position", position).add("salary:", salary).toString();
    }
}
