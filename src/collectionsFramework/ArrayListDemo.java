package collectionsFramework;
/*
ArrayList具有如下所示的构造函数：
ArrayList（）
ArrayList（Collection<？extends E>c）
ArrayList（int capacity）
第1个构造函数构建一个空的数组列表。第2个构造函数构建一个数组列表，使用集合c的元素进行初始化。第3个构造函数构建一个初始容量为capacity的数组列表。
容量是用于存储元素的数组的大小。当向数组列表中添加元素时，容量会自动增长。
下面的程序演示了ArrayList类的简单应用。该程序为String类型的对象创建了一个数组列表，然后向其中添加了几个字符串（回想一下，带引号的字符串会被转换
为String对象）。然后显示这个列表。移除一些元素后，再次显示这个列表。
   */

import java.util.*;

//Demonstrate ArrayList.
public class ArrayListDemo {
    public static void main(String args[]) {
//Create an array list.
        ArrayList<String> al = new ArrayList<String>();
        System.out.println("Initial size of al:" + al.size());
//Add elements to the array list.
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "A2");
        System.out.println("Size of al after additions:" + al.size());
//Display the array list.
        System.out.println("Contents of al:" + al);
//Remove elements from the array list.
        al.remove("F");
        al.remove(2);
        System.out.println("Size of al after deletions:" + al.size());
        System.out.println("Contents of al:" + al);
    }
}