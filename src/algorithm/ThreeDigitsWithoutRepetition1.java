package algorithm;

import java.util.ArrayList;
import java.util.List;

//1��2��3��4����ɶ������ظ����ֵ���λ��
public class ThreeDigitsWithoutRepetition1 {
    public static void main(String[] args) {
        List<Integer> results = new ArrayList<>();
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if (i == j) {
                    continue;
                }
                for (int k = 1; k <= 4; k++) {
                    if (i == k || j == k)
                        continue;
                    int num = 100 * i + 10 * j + k;
                    results.add(num);
                }
            }
        }
        System.out.println("�������������ĸ���:" + results.size());
        System.out.println("������������:");
        //for(type itr-var:collection)statement-block
        //itr-varָ���˵�������������
        for (Integer result : results) {
            System.out.print(result + "\t");
        }
        /*
         for(int i=0;i<results.size();i++){
   System.out.println("������������Ϊ"+results.get(i));
  }
         */
    }
}
