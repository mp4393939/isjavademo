package algorithm;

import java.util.Scanner;

//�жϻ�����
public class JudgePalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("���������֣�");
        long input = sc.nextLong();
        System.out.print("�������Ƿ��ǻ������֣���" + ifPalindromicNumber(input));
        //Scanner sc1 = new Scanner(System.in);
        System.out.println("");
        System.out.print("Ҫ�����ж����ֻ��ǽ�����    1������    2��������");
        int s = sc.nextInt();

        switch (s) {
            case 1:
                System.out.print("���������֣�");
                long input1 = sc.nextLong();
                System.out.print("�������Ƿ��ǻ������֣���" + ifPalindromicNumber(input1));
                System.out.println("");
                System.out.print("Ҫ�����ж����ֻ��ǽ�����    1������    2��������");
                int s1 = sc.nextInt();
                while (s1 == 1) {
                    JudgePalindromeNumber j = new JudgePalindromeNumber();
                    j.LoopBody();
                    //break123212;
                }
                break;
            case 2:
                System.exit(0);
                break;
        }

    }

    private static long palindromicNumber(long num) {
        long temp = 0;
        while (num != 0) {
            temp *= 10;
            temp += num % 10;
            num /= 10;

        }
        return temp;
    }

    private static boolean ifPalindromicNumber(long num) {
        long temp = palindromicNumber(num);
        return temp == num;
    }

    private void LoopBody() {
        Scanner sc11 = new Scanner(System.in);
        System.out.println("");
        System.out.print("Ҫ�����ж����ֻ��ǽ�����    1������    2��������");
        int s1 = sc11.nextInt();
        switch (s1) {
            case 1:
                System.out.print("���������֣�");
                long input1 = sc11.nextLong();
                System.out.print("�������Ƿ��ǻ������֣���" + ifPalindromicNumber(input1));
                System.out.println("");
                System.out.print("Ҫ�����ж����ֻ��ǽ�����    1������    2��������");
                break;
            //int s111 = sc11.nextInt();
            case 2:
                System.exit(0);
                break;
        }
    }
}