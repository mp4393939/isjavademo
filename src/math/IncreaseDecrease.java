package math;

/*
Java�������������++�����Լ��������--���̳���C++������ʹ������ֵ��1���1������д�ڱ���ǰ�ͱ������в�ͬ��Ч����
-���д�ڱ���ǰ��ʾ��ʹ���������֮ǰ��1���1
-���д�ڱ���֮���ʾ�������ʹ����֮���ټ�1���1
*/
public class IncreaseDecrease {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        //�Ƚ�a��ֵ����c1��Ȼ��a���Լ�
        int c1 = a++;
        //�Ƚ�b��ֵ�Լӣ�Ȼ���ٸ���c2
        int c2 = ++b;
        System.out.println("a:" + a);//11
        System.out.println("c1:" + c1);//10
        System.out.println("b:" + b);//21
        System.out.println("c2:" + c2);//21
        int i = 50;
        int j = 88;
        //�Ƚ�i��ֵ����k1��Ȼ��a���Լ�
        int k1 = i--;
        //�Ƚ�j��ֵ�Լ���Ȼ���ٸ���k2
        int k2 = --j;
        System.out.println("i:" + i);//49
        System.out.println("k1:" + k1);//50
        System.out.println("j:" + j);//87
        System.out.println("k2:" + k2);//87
    }
}