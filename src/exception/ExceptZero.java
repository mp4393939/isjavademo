package exception;

import java.util.Scanner;

//除零异常
public class ExceptZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字：");
        String input = sc.next();
        try {
            //用parseInt()方法将String类型转化为int类型
            int a = Integer.parseInt(input);
            ExceptZero z = new ExceptZero();
            z.ExceptZero(a);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    private int ExceptZero(int i) {
        try {
            return i / 0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("此处出现异常：算术异常");
        } finally {
            System.out.println("finally代码块：" + i * i);
        }
        return 0;

    }


}
