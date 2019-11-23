package Design;
/*
在开始的时候将单例类型注入到一个容器之中，也就是单例ManagerClass，在使用的时候再根据key值获取对应的实例，这种方式可以使我们很方便的管理很多单例对象，也对用户隐藏了具体实现类,
降低了耦合度；但是为了避免造成内存泄漏，一般在生命周期销毁的时候也要去销毁它。
 */

import java.util.HashMap;
import java.util.Map;

//单例模式：容器
public class Singleton6 {
    private static Map<String, Object> objMap = new HashMap<>();

    private Singleton6() {
    }

    private static void putObject(String key, String instance) {
        if (!objMap.containsKey(key)) {
            objMap.put(key, instance);
        }
    }

    public static Object getObject(String key) {
        return objMap.get(key);
    }

    public static void main(String[] args) {
        putObject("docker", "65");
        getObject("docker");
    }
}
