package collectionsFramework;

import java.util.HashMap;
import java.util.Set;

//对这个HashMap进行反转，key变成value,value变成key
public class KeyValueReverse {
    public static void main(String[] args) {
        HashMap<String, String> dictionary = new HashMap<>();
        HashMap<String, String> dictionary2 = new HashMap<>();

        dictionary.put("adc", "物理英雄");
        dictionary.put("apc", "魔法英雄");
        dictionary.put("t", "坦克");

        System.out.println("初始化后的dictionary:");
        System.out.println(dictionary);

        Set<String> keys = dictionary.keySet();


        System.out.println("反转：");

        for (String key : keys) {
            String value = dictionary.get(key);
            dictionary2.put(value, key);
        }
        System.out.println(dictionary2);
    }
}
