package decorator.generalImpl;

/**
 * Created by yh on 2018/7/25.
 */
public abstract class Decorator extends Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operate() {
        this.component.operate();
    }
}
