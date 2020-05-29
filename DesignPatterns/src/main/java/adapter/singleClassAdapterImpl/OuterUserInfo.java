package adapter.singleClassAdapterImpl;

/**
 * Created by yh on 9/4/18.
 */
public class OuterUserInfo extends OuterUser implements IUserInfo {
    @Override
    public String getUserName() {
        return super.getUserBaseInfo().get("userName");
    }

    @Override
    public String getHomeAddress() {
        return super.getUserHomeInfo().get("homeAddress");
    }

    @Override
    public String getMobileNumber() {
        return super.getUserBaseInfo().get("mobileNumber");
    }
}
