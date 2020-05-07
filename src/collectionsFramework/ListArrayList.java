package collectionsFramework;

import java.util.ArrayList;
import java.util.List;

//将100以内的所有偶数依次赋给数组中的元素,并向控制台输出各元素
public class ListArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) {
                list.add(i);
            }
        }
        Integer[] ouShu = new Integer[list.size()];
        ouShu = list.toArray(ouShu);
        for (int i : ouShu) {
            System.out.println(i);
        }
    }
}