package Design;
/*
�ڿ�ʼ��ʱ�򽫵�������ע�뵽һ������֮�У�Ҳ���ǵ���ManagerClass����ʹ�õ�ʱ���ٸ���keyֵ��ȡ��Ӧ��ʵ�������ַ�ʽ����ʹ���Ǻܷ���Ĺ���ܶ൥������Ҳ���û������˾���ʵ����,
��������϶ȣ�����Ϊ�˱�������ڴ�й©��һ���������������ٵ�ʱ��ҲҪȥ��������
 */

import java.util.HashMap;
import java.util.Map;

//����ģʽ������
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
