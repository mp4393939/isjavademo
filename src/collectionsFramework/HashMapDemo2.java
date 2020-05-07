package collectionsFramework;
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

public class HashMapDemo2 {
    public static void main(String[] args) {
        //Create a hash map.��ʽ���Ͳ����ַ�����string��Double�����滻Ϊ<>
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
        System.out.println("�޸�ǰ��HashMap���ȣ�" + hm.size());
        System.out.println("-----------------------------------------------------");
        //new
        hm.put("Jack", 1200.00);
        hm.put("Kyle", 1800.00);
        hm.put("Lee", 12.50);
        System.out.println("����Jack��" + +hm.get("Jack"));
        System.out.println("����Kyle��" + hm.get("Kyle"));
        System.out.println("����Lee��" + hm.get("Lee"));
        //Deposit 1000 into John Doe's account.
        double balance = hm.get("John Doe");
        hm.put("John Doe", balance + 1000);
        System.out.println("�޸ĺ��John Doe��" + hm.get("John Doe"));
        //replace:�滻
        hm.replace("Tod Hal1", 999.99);
        System.out.println("�޸ĺ��Tod Hal1��" + hm.get("Tod Hal1"));
        //remove:ȥ�����ų�
        hm.remove("Tom Smith", 123.22);
        System.out.println("�޸ĺ��HashMap���ȣ�" + hm.size());
        System.out.println("-----------------------------------------------------");
        for (Map.Entry<String, Double> me : set) {
            System.out.println(me.getKey() + ":" + me.getValue());
        }
    }
}
