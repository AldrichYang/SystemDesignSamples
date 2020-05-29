package builder;

import java.util.List;

/**
 * Created by yh on 2018/5/21.
 */
public abstract class CarBuilder {

    public abstract void setSequence(List<String> sequence);

    public abstract CarModel getCarModel();
}
