package builder;

import java.util.List;

/**
 * Created by yh on 2018/5/21.
 */
public class BMWBuilder extends CarBuilder {
    private BMWModel bmwModel = new BMWModel();

    @Override
    public void setSequence(List<String> sequence) {
        this.bmwModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.bmwModel;
    }
}
