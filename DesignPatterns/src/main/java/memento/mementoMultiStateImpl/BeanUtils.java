package memento.mementoMultiStateImpl;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;

/**
 * Created by yh on 10/11/18.
 */
public class BeanUtils {

    public static HashMap<String, Object> backupProp(Object bean) {
        HashMap<String, Object> objectHashMap = new HashMap<>();
        try {
//            获得bean描述
            BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
//            获得属性描述
            PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
//            遍历所有属性
            for (PropertyDescriptor descriptor : descriptors) {
//                属性名字
                String fieldName = descriptor.getName();
//                读取属性的方法
                Method getter = descriptor.getReadMethod();
//                读取属性值
                Object fieldValue = getter.invoke(bean);
                if (!fieldName.equalsIgnoreCase("class")) {
                    objectHashMap.put(fieldName, fieldValue);
                }
            }

        } catch (Exception e) {

        }
        return objectHashMap;

    }

    public static void restoreProp(Object bean, HashMap<String, Object> propMap) {
        try {
            //            获得bean描述
            BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
//            获得属性描述
            PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
//            遍历所有属性
            for (PropertyDescriptor descriptor : descriptors) {
//                属性名字
                String fieldName = descriptor.getName();
                if (propMap.containsKey(fieldName)) {
//                    写入属性的方法
                    Method setter = descriptor.getWriteMethod();
//                写入属性值
                    Object fieldValue = setter.invoke(bean, propMap.get(fieldName));
                }
//
            }
        } catch (Exception e) {

        }
    }
}
