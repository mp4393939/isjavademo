package algorithm;

/*
��ӡ��1000���ڵ� "ˮ�ɻ��� "����ν "ˮ�ɻ��� "��ָһ����λ�������λ���������͵��ڸ����������磺153��һ�� "ˮ�ɻ��� "����Ϊ153=1�����η���5�����η���3�����η���
 */
public class NarcissisticNumber {
    public static void main(String[] args) {
        int b1, b2, b3;
        for (int m = 101; m < 1000; m++) {
            b3 = m / 100;
            b2 = m % 100 / 10;
            b1 = m % 10;
            if ((b3 * b3 * b3 + b2 * b2 * b2 + b1 * b1 * b1) == m) {
                System.out.println(m + "��һ��ˮ�ɻ���");
            }
        }
    }
}