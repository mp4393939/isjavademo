package collectionsFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//Map中是一个key有且只有一个value.但是一个value可以对应多个key值.一般都是通过key,然后map.get(key)获得到value.如果想要反向想通过value获得key的值,提供第一种方法
public class getKey1 {
    //根据value值获取到对应的一个key值
    public static String getKey(HashMap<String, String> map, String value) {
        String key = null;
        //Map,HashMap并没有实现Iteratable接口.不能用于增强for循环.
        for (String getKey : map.keySet()) {
            if (map.get(getKey).equals(value)) {
                key = getKey;
            }
        }
        return key;
        //这个key肯定是最后一个满足该条件的key.
    }

    //根据value值获取到对应的所有的key值
    public static List<String> getKeyList(HashMap<String, String> map, String value) {
        List<String> keyList = new ArrayList();
        for (String getKey : map.keySet()) {
            if (map.get(getKey).equals(value)) {
                keyList.add(getKey);
            }
        }
        return keyList;
    }

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap();
        map.put("CHINA", "中国");
        map.put("CN", "中国");
        map.put("AM", "美国");
        //获取一个Key
        System.out.println("通过value获取Key:" + getKey(map, "中国"));//输出"CN"
        System.out.println("通过value获取Key:" + getKey(map, "美国"));//输出"AM"
        //获得所有的key值
        System.out.println("通过value获取所有的key值:" + getKeyList(map, "中国"));//输出"[CHINA, CN]"

    }
}
