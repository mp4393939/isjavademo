package array;

import java.util.Arrays;
import java.util.Scanner;

//�������10��������ӵ�������
public class Array1 {
    public static void main(String[] args) {
        int len = 10;//�����Ԫ�ظ���
        int[] ary = new int[len];//��������
        Scanner sc = new Scanner(System.in);//�õ�һ��ɨ����,���ڶ�ȡ����̨����
        for (int i = 0; i < ary.length; i++) {//ѭ��
            System.out.print("�����������" + (i + 1) + "������:");
            ary[i] = sc.nextInt();//�������ֵ�浽������
        }
        System.out.println(Arrays.toString(ary));//��ӡ����
    }
}
