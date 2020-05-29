package builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yh on 2018/5/21.
 */
public abstract class CarModel {
    private List<String> sequence = new ArrayList<>();

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    final public void run() {
        sequence.forEach(x -> {
            switch (x) {
                case "start":
                    start();
                    break;
                case "stop":
                    stop();
                    break;
                case "alarm":
                    alarm();
                    break;
                case "engineBoom":
                    engineBoom();
                    break;
            }
        });
    }

    final public void setSequence(List<String> sequence) {
        this.sequence = sequence;
    }

}
