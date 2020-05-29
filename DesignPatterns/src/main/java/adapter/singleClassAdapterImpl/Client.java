package adapter.singleClassAdapterImpl;

/**
 * Created by yh on 9/4/18.
 */
public class Client {
    public static void main(String[] args) {
        IUserInfo userInfo = new UserInfo();
        IUserInfo outerInfo = new OuterUserInfo();
        System.out.println(userInfo.getUserName());
        System.out.println(outerInfo.getUserName());
    }
}
