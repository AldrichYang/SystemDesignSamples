package adapter.singleClassAdapterImpl;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yh on 9/4/18.
 */
public class OuterUser implements IOuterUser {
    @Override
    public Map<String, String> getUserBaseInfo() {
        HashMap<String, String> baseInfoMap = new HashMap<>();
        baseInfoMap.put("userName", "外部员工的名字是:XXX");
        baseInfoMap.put("mobileNumber", "外部员工的电话是:XXX");
        return baseInfoMap;
    }

    @Override
    public Map<String, String> getUserOfficeInfo() {
        HashMap<String, String> officeInfoMap = new HashMap<>();
        officeInfoMap.put("officePhone", "外部员工的办公电话是:XXX");
        officeInfoMap.put("officeId", "外部员工的工号是:XXX");
        return officeInfoMap;
    }

    @Override
    public Map<String, String> getUserHomeInfo() {
        HashMap<String, String> homeInfoMap = new HashMap<>();
        homeInfoMap.put("homeAddress", "外部员工的住址是:XXX");
        return homeInfoMap;
    }
}
