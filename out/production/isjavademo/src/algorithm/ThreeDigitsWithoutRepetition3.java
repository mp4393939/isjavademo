package algorithm;


//��1��2��3��4�ĸ����֣�����ɶ��ٸ�������ͬ�����ظ����ֵ���λ�������Ƕ��٣�
public class ThreeDigitsWithoutRepetition3 {
    public static void main(String[] args) {

        long starTime = System.currentTimeMillis();
        int count = 0;
        for (int x = 1; x < 5; x++) {
            for (int y = 1; y < 5; y++) {
                for (int z = 1; z < 5; z++) {
                    if (x != y && y != z && x != z) {
                        count++;
                        System.out.println(x * 100 + y * 10 + z);
                    }
                }
            }
        }
        System.out.println("����" + count + "����λ��");
        long endTime = System.currentTimeMillis();
        System.out.println("��������ʱ�䣺" + (endTime - starTime) + "ms");
    }

}