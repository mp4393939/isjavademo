package algorithm;

import java.util.ArrayList;
import java.util.List;

//1、2、3、4能组成多少无重复数字的三位数
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
        System.out.println("满足条件的数的个数:" + results.size());
        System.out.println("满足条件的数:");
        //for(type itr-var:collection)statement-block
        //itr-var指定了迭代变量的名称
        for (Integer result : results) {
            System.out.print(result + "\t");
        }
        /*
         for(int i=0;i<results.size();i++){
   System.out.println("满足条件的数为"+results.get(i));
  }
         */
    }
}
