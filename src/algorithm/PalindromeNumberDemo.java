package algorithm;

import java.util.Scanner;

public class PalindromeNumberDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入数字：");
        long input = sc.nextLong();
        System.out.print("该数字是否是回文数字？：" + ifPalindromicNumber(input));
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
}
