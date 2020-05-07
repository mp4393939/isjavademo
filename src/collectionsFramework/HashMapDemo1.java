package collectionsFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo1 {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        Set<Map.Entry<Integer, String>> set = hm.entrySet();
        hm.put(100, "Jack");
        hm.put(null, null);
        hm.put(200, "");
        for (Map.Entry<Integer, String> me : set) {
            System.out.println(me.getKey() + ":" + me.getValue());
        }
        hm.remove(200, "");
        hm.remove(null);
        System.out.println("-----------------------------------------------------");
        for (Map.Entry<Integer, String> me : set) {
            System.out.println(me.getKey() + ":" + me.getValue());
        }

    }
}
