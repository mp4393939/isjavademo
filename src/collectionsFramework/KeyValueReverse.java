package collectionsFramework;

import java.util.HashMap;
import java.util.Set;

//�����HashMap���з�ת��key���value,value���key
public class KeyValueReverse {
    public static void main(String[] args) {
        HashMap<String, String> dictionary = new HashMap<>();
        HashMap<String, String> dictionary2 = new HashMap<>();

        dictionary.put("adc", "����Ӣ��");
        dictionary.put("apc", "ħ��Ӣ��");
        dictionary.put("t", "̹��");

        System.out.println("��ʼ�����dictionary:");
        System.out.println(dictionary);

        Set<String> keys = dictionary.keySet();


        System.out.println("��ת��");

        for (String key : keys) {
            String value = dictionary.get(key);
            dictionary2.put(value, key);
        }
        System.out.println(dictionary2);
    }
}
