package factory;

import static java.lang.System.out;

/**
 * Created by yh on 2018/6/12.
 */
public class NvWa {
    public static void main(String[] args) {
        AbstracHumanFactory humanFactory = new HumanFactory();
        out.println("--第一批人是白色人种--");
        Human whiteHuman = humanFactory.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();
        out.println("--第二批人种是黑色人种--");
        Human blackHuman = humanFactory.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
        out.println("--第三批人种是黄色色人种--");
        Human yellowHuman = humanFactory.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
    }
}
