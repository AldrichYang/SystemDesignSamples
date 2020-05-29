package adapter.singleClassAdapterImpl;

/**
 * Created by yh on 9/4/18.
 */
public class UserInfo implements IUserInfo {
    @Override
    public String getUserName() {
        System.out.println("员工的姓名是....");
        return null;
    }

    @Override
    public String getHomeAddress() {
        System.out.println("员工的家庭住址是....");
        return null;
    }

    @Override
    public String getMobileNumber() {
        System.out.println("员工的手机号码是....");
        return null;
    }
}
