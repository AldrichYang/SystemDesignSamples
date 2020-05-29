package prototype;

/**
 * Created by yh on 2018/7/6.
 */
public class PrototypeClass implements Cloneable {
    @Override
    protected PrototypeClass clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException cnse) {
            cnse.printStackTrace();
        }
        return (PrototypeClass) clone;
    }
}
