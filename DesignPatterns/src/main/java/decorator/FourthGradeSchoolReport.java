package decorator;

/**
 * Created by yh on 2018/7/25.
 */
public class FourthGradeSchoolReport extends SchoolReport {
    @Override
    public void report() {
        System.out.println("四年级的成绩单是：语文60，数学61, 英语62");
        System.out.println(".....");
        System.out.println("            家长签名:  ");
    }

    @Override
    public void sign(String name) {
        System.out.println("家长签名是:" + name);
    }
}
