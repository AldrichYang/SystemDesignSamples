package builder;

import java.util.List;

/**
 * Created by yh on 2018/5/21.
 */
public class BenzBuilder extends CarBuilder {

    private BenzModel benzModel = new BenzModel();

    @Override
    public void setSequence(List<String> sequence) {
        benzModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.benzModel;
    }
}
