package array;

import java.util.*;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5, 6};
        int[] b = new int[]{11, 12, 13, 14, 15, 16};
        Arrays.copyOf(a, a.length + 2);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        /*
public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
代码解释:
Object src : 原数组
int srcPos : 从元数据的起始位置开始
Object dest : 目标数组
int destPos : 目标数组的开始起始位置
int length  : 要copy的数组的长度
 */
        System.arraycopy(a, 0, b, 2, 4);
        System.out.println("\n");
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
        System.out.println("a的长度=" + a.length + "\n" + "b的长度=" + b.length);

    }


}
