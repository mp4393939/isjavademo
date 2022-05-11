package collectionsFramework;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashtableDemo1 {
    public static void main(String[] args) throws NullPointerException {
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(100, "Jack");
        //key、value只要一个是null，会导致出现NullPointerException异常
        //ht.put(null,null);
        ht.put(200, "");
        ht.put(300, "abc");
        Set<Map.Entry<Integer, String>> set = ht.entrySet();
        for (Map.Entry<Integer, String> me : set) {
            System.out.println(me.getKey() + ":" + me.getValue());
        }
        ht.remove(100, "Jack");
        ht.replace(200, "this is 200");
        ht.remove(300);
        System.out.println("-----------------------------------------------------");
        for (Map.Entry<Integer, String> me : set) {
            System.out.println(me.getKey() + ":" + me.getValue());
        }
    }
}
