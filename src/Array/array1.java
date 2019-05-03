package Array;

import java.util.*;

public class array1 {
    public static void main(String[] args) {
        //Scanner in=new Scanner(System.in);
        int[] a = new int[]{1, 2, 3, 4, 5, 6};
        int[] b = new int[]{11, 12, 13, 14, 15, 16};
        Arrays.copyOf(a, a.length + 2);
        System.arraycopy(a, 0, b, 2, 4);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("\n");
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
        System.out.println("a的长度=" + a.length + "\n" + "b的长度=" + b.length);

    }


}
