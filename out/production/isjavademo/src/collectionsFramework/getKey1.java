package collectionsFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//Map����һ��key����ֻ��һ��value.����һ��value���Զ�Ӧ���keyֵ.һ�㶼��ͨ��key,Ȼ��map.get(key)��õ�value.�����Ҫ������ͨ��value���key��ֵ,�ṩ��һ�ַ���
public class getKey1 {
    //����valueֵ��ȡ����Ӧ��һ��keyֵ
    public static String getKey(HashMap<String, String> map, String value) {
        String key = null;
        //Map,HashMap��û��ʵ��Iteratable�ӿ�.����������ǿforѭ��.
        for (String getKey : map.keySet()) {
            if (map.get(getKey).equals(value)) {
                key = getKey;
            }
        }
        return key;
        //���key�϶������һ�������������key.
    }

    //����valueֵ��ȡ����Ӧ�����е�keyֵ
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
        map.put("CHINA", "�й�");
        map.put("CN", "�й�");
        map.put("AM", "����");
        //��ȡһ��Key
        System.out.println("ͨ��value��ȡKey:" + getKey(map, "�й�"));//���"CN"
        System.out.println("ͨ��value��ȡKey:" + getKey(map, "����"));//���"AM"
        //������е�keyֵ
        System.out.println("ͨ��value��ȡ���е�keyֵ:" + getKeyList(map, "�й�"));//���"[CHINA, CN]"

    }
}
