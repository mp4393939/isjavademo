package loop;

//��������ð������
public class NumberSort {
    public static void main(String[] args) {
        int[] num = new int[]{1, 5, 8, 2, 3, 9, 4};
        int i, j;
        for (i = 0; i < num.length - 1; i++) {
            for (j = 0; j < num.length - 1 - i; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
        System.out.println("��С���������Ľ����:");
        for (i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println("\n" + "�Ӵ�С�����Ľ����:");
        for (i = num.length - 1; i >= 0; i--) {
            System.out.print(num[i] + " ");
        }
    }
}
