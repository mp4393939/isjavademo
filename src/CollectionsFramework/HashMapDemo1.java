package CollectionsFramework;
/*
HashMap��չ��AbstractMap�ಢʵ����Map�ӿڡ���ʹ�ù�ϣ��洢ӳ�䣬��ʹ�ü�ʹ���ڱȽϴ�ļ��ϣ�get0��put��������ִ��ʱ��Ҳ���ֲ��䡣HashMap�Ƿ����࣬
���������£�
class HashMap<K��V>
���У�Kָ���˼������ͣ�Vָ����ֵ�����͡�
HashMap�ඨ�������¹��캯����
HashMap()
HashMap(Map<? extends K,? extends V> m)
HashMap(int capacity)
HashMap(int capacity,float fi1lRatio)
��1����ʽ����һ��Ĭ�ϵĹ�ϣӳ�䡣
��2����ʽʹ��m�е�Ԫ�س�ʼ����ϣӳ�䡣
��3����ʽ����ϣӳ���������ʼ��Ϊcapacity��
��4����ʽʹ�ò���ͬʱ��ʼ������������ʡ�
����������ʵĺ�����ǰ��������HashSet��ͬ��Ĭ��������16��Ĭ���������0.75��
HashMapʵ����Map�ӿڲ���չ��AbstractMap�࣬��û������κ��Լ��ķ�����
Ӧ��ע���ϣӳ�䲻��֤Ԫ�ص�˳�����ԣ����ϣӳ�����Ԫ�ص�˳��һ����ͨ����������ȡ���ǵ�˳��
����ĳ�����ʾ��HashMap��������ӳ�䵽�˻���ע���ȡ��ʹ������ͼ�ķ�ʽ��
*/

import java.util.*;

class HashMapDemo {
    public static void main(String[] args) {
        //Create a hash map.��ʽ���Ͳ����ַ�����String��Double�����滻Ϊ<>
        HashMap<String, Double> hm = new HashMap<>();
        // Put elements to the map
        hm.put("John Doe", 3434.34);
        hm.put("Tom Smith", 123.22);
        hm.put("Jane Baker", 1378.00);
        hm.put("Tod Hal1", 99.22);
        hm.put("Ralph Smith", -19.08);
//Get a set of the entries.
        Set<Map.Entry<String, Double>> set = hm.entrySet();
//Display the set.
        for (Map.Entry<String, Double> me : set) {
            System.out.println(me.getKey() + ":" + me.getValue());
        }
        System.out.println("-----------------------------------------------------");
        //Deposit 1000 into John Doe's account.
        double balance = hm.get("John Doe");
        hm.put("John Doe", balance + 1000);
        System.out.println("John Doe's new balance:" +
                hm.get("John Doe"));
    }
}
