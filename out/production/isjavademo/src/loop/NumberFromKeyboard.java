package loop;

import java.util.Scanner;

public class NumberFromKeyboard {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in, "GBK");
        System.out.print("���������ָ���:");
        int n = read.nextInt();
        int[] arr = new int[n];
        System.out.print("������Ҫ���������:" + "\n");
        for (int t = 0; t < arr.length; t++) {
            arr[t] = read.nextInt();
        }
        fun(arr);
    }

    public static void fun(int[] array) {//����
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int j : array) {//���
            System.out.print(j + " ");
        }
    }
}
