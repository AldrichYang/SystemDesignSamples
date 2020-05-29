package adapter.singleClassAdapterImpl;

import java.util.Map;

/**
 * Created by yh on 9/4/18.
 */
public interface IOuterUser {
    Map<String,String> getUserBaseInfo();

    Map<String,String> getUserOfficeInfo();

    Map<String,String> getUserHomeInfo();
}
