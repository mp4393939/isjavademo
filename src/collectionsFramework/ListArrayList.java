package collectionsFramework;

import java.util.ArrayList;

//��100���ڵ�����ż�����θ��������е�Ԫ��,�������̨�����Ԫ��
public class ListArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
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