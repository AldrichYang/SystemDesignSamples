package composite.transparentImpl;

import java.util.List;

/**
 * Created by yh on 9/7/18.
 */
public class Leaf extends Component {
    @Override
    public void doSth() {
        super.doSth();
    }

    @Override
    @Deprecated
    public void add(Component component) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public void remove(Component component) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public List<Component> getChildren() throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }
}
