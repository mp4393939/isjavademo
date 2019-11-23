package CollectionsFramework;
/*
HashMap扩展了AbstractMap类并实现了Map接口。它使用哈希表存储映射，这使得即使对于比较大的集合，get0和put）方法的执行时间也保持不变。HashMap是泛型类，
其声明如下：
class HashMap<K，V>
其中，K指定了键的类型，V指定了值的类型。
HashMap类定义了以下构造函数：
HashMap()
HashMap(Map<? extends K,? extends V> m)
HashMap(int capacity)
HashMap(int capacity,float fi1lRatio)
第1种形式构造一个默认的哈希映射。
第2种形式使用m中的元素初始化哈希映射。
第3种形式将哈希映射的容量初始化为capacity。
第4种形式使用参数同时初始化容量和填充率。
容量和填充率的含义与前面描述的HashSet相同。默认容量是16，默认填充率是0.75。
HashMap实现了Map接口并扩展了AbstractMap类，但没有添加任何自己的方法。
应当注意哈希映射不保证元素的顺序。所以，向哈希映射添加元素的顺序不一定是通过迭代器读取它们的顺序。
下面的程序演示了HashMap，将名字映射到账户金额。注意获取和使用组视图的方式：
*/

import java.util.*;

class HashMapDemo {
    public static void main(String[] args) {
        //Create a hash map.显式类型参数字符串，String、Double可以替换为<>
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
