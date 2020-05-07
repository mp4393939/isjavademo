package collectionsFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//Map中是一个key有且只有一个value.但是一个value可以对应多个key值.一般都是通过key,然后map.get(key)获得到value.如果想要反向想通过value获得key的值,提供第二种方法
public class getKey2 {
    HashMap<String, String> map = null;

    public getKey2(HashMap<String, String> map) {
        this.map = map;
    }

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("1", "a");
        map.put("2", "b");
        map.put("3", "c");
        map.put("4", "c");
        map.put("5", "e");
        getKey2 getKey2 = new getKey2(map);
        System.out.println(getKey2.getKey("c"));//输出[3, 4]
    }

    private ArrayList<String> getKey(String value) {
        ArrayList<String> keyList = new ArrayList<String>();
        String key = null;
        Set<Entry<String, String>> set = map.entrySet();
        // entrySet()方法就是把map中的每个键值对变成对应成Set集合中的一个对象.
        // set对象中的内容如下:[3=c, 2=b, 1=a, 5=e, 4=c]
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = (Map.Entry<String, String>) it.next();
            // entry中的内容就是set集合中的每个对象(map集合中的一个键值对)3=c....
            // Map.Entry就是一种类型,专值map中的一个键值对组成的对象.
            if (entry.getValue().equals(value)) {
                key = (String) entry.getKey();
                keyList.add(key);
            }
        }
        return keyList;
    }

}
