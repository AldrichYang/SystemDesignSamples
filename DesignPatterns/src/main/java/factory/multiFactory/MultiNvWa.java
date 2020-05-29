package factory.multiFactory;

import factory.Human;

import static java.lang.System.out;

/**
 * Created by yh on 2018/6/13.
 */
public class MultiNvWa {
    public static void main(String[] args) {
        out.println("--第一批人是白色人种--");
        Human whiteHuman = new WhiteHumanFactory().createHuman();
        whiteHuman.getColor();
        whiteHuman.talk();
        out.println("--第二批人种是黑色人种--");
        Human blackHuman = new BlackHumanFactory().createHuman();
        blackHuman.getColor();
        blackHuman.talk();
        out.println("--第三批人种是黄色色人种--");
        Human yellowHuman = new YellowHumanFactory().createHuman();
        yellowHuman.getColor();
        yellowHuman.talk();
    }
}
