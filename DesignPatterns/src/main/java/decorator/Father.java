package decorator;

/**
 * Created by yh on 2018/7/25.
 */
public class Father {
    public static void main(String[] args) {
//        extendsCall();
        decoratorCall();

    }

    private static void originCall() {
        SchoolReport schoolReport = new FourthGradeSchoolReport();
        schoolReport.report();
    }

    private static void extendsCall() {
        SchoolReport schoolReport = new SugarFourthGradeSchoolReport();
        schoolReport.report();
        schoolReport.sign("老三");

    }

    private static void decoratorCall() {
//        原装的成绩单
        SchoolReport sr = new FourthGradeSchoolReport();
//        加了最高分说明的成绩单
        sr = new HighScoreDecorator(sr);
//        加了排名的成绩单
        sr = new SortDecorator(sr);
        sr.report();
        sr.sign("老三");

    }
}
