package decorator;

/**
 * Created by yh on 2018/7/25.
 */
public class SugarFourthGradeSchoolReport extends FourthGradeSchoolReport {
    private void reportHighScore() {
        System.out.println("这次考试语文最高是70,数据是71,英语是72");
    }

    private void reportSort() {
        System.out.println("我是排名第38名..");
    }

    @Override
    public void report() {
        reportHighScore();
        super.report();
        reportSort();
    }
}
