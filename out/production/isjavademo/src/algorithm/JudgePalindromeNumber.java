package algorithm;

import java.util.Scanner;

//判断回文数
public class JudgePalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入数字：");
        long input = sc.nextLong();
        System.out.print("该数字是否是回文数字？：" + ifPalindromicNumber(input));
        //Scanner sc1 = new Scanner(System.in);
        System.out.println("");
        System.out.print("要继续判断数字还是结束？    1、继续    2、结束：");
        int s = sc.nextInt();

        switch (s) {
            case 1:
                System.out.print("请输入数字：");
                long input1 = sc.nextLong();
                System.out.print("该数字是否是回文数字？：" + ifPalindromicNumber(input1));
                System.out.println("");
                System.out.print("要继续判断数字还是结束？    1、继续    2、结束：");
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
        System.out.print("要继续判断数字还是结束？    1、继续    2、结束：");
        int s1 = sc11.nextInt();
        switch (s1) {
            case 1:
                System.out.print("请输入数字：");
                long input1 = sc11.nextLong();
                System.out.print("该数字是否是回文数字？：" + ifPalindromicNumber(input1));
                System.out.println("");
                System.out.print("要继续判断数字还是结束？    1、继续    2、结束：");
                break;
            //int s111 = sc11.nextInt();
            case 2:
                System.exit(0);
                break;
        }
    }
}