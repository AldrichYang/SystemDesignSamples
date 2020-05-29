package factory.simpleFactory;

import factory.*;

import static java.lang.System.out;

/**
 * Created by yh on 2018/6/12.
 */
public class SimpleNvWa {
    public static void main(String[] args) {

        out.println("--第一批人是白色人种--");
        Human whiteHuman = SimpleHumanFactory.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();
        out.println("--第二批人种是黑色人种--");
        Human blackHuman = SimpleHumanFactory.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
        out.println("--第三批人种是黄色色人种--");
        Human yellowHuman = SimpleHumanFactory.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
    }
}
