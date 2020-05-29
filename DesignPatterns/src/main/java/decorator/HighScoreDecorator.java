package decorator;

/**
 * Created by yh on 2018/7/25.
 */
public class HighScoreDecorator extends Decorator {
    public HighScoreDecorator(SchoolReport sr) {
        super(sr);
    }

    private void reportHighScore() {
        System.out.println("这次考试语文最高是70,数据是71,英语是72");
    }

    @Override
    public void report() {
        reportHighScore();
        super.report();
    }
}
