package array;

import java.util.Arrays;
import java.util.Scanner;

//将输入的10个数字添加到数组中
public class Array1 {
    public static void main(String[] args) {
        int len = 10;//数组的元素个数
        int[] ary = new int[len];//定义数组
        Scanner sc = new Scanner(System.in);//得到一个扫描器,用于读取控制台输入
        for (int i = 0; i < ary.length; i++) {//循环
            System.out.print("请输入数组第" + (i + 1) + "个整数:");
            ary[i] = sc.nextInt();//把输入的值存到数组里
        }
        System.out.println(Arrays.toString(ary));//打印数组
    }
}
