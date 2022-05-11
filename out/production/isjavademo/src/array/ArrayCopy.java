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
�������:
Object src : ԭ����
int srcPos : ��Ԫ���ݵ���ʼλ�ÿ�ʼ
Object dest : Ŀ������
int destPos : Ŀ������Ŀ�ʼ��ʼλ��
int length  : Ҫcopy������ĳ���
 */
        System.arraycopy(a, 0, b, 2, 4);
        System.out.println("\n");
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
        System.out.println("a�ĳ���=" + a.length + "\n" + "b�ĳ���=" + b.length);

    }


}
