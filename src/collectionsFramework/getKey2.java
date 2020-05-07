package collectionsFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//Map����һ��key����ֻ��һ��value.����һ��value���Զ�Ӧ���keyֵ.һ�㶼��ͨ��key,Ȼ��map.get(key)��õ�value.�����Ҫ������ͨ��value���key��ֵ,�ṩ�ڶ��ַ���
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
        System.out.println(getKey2.getKey("c"));//���[3, 4]
    }

    private ArrayList<String> getKey(String value) {
        ArrayList<String> keyList = new ArrayList<String>();
        String key = null;
        Set<Entry<String, String>> set = map.entrySet();
        // entrySet()�������ǰ�map�е�ÿ����ֵ�Ա�ɶ�Ӧ��Set�����е�һ������.
        // set�����е���������:[3=c, 2=b, 1=a, 5=e, 4=c]
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = (Map.Entry<String, String>) it.next();
            // entry�е����ݾ���set�����е�ÿ������(map�����е�һ����ֵ��)3=c....
            // Map.Entry����һ������,רֵmap�е�һ����ֵ����ɵĶ���.
            if (entry.getValue().equals(value)) {
                key = (String) entry.getKey();
                keyList.add(key);
            }
        }
        return keyList;
    }

}
