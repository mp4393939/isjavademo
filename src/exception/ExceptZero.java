package exception;

import java.util.Scanner;

//�����쳣
public class ExceptZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("���������֣�");
        String input = sc.next();
        try {
            //��parseInt()������String����ת��Ϊint����
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
            System.out.println("�˴������쳣�������쳣");
        } finally {
            System.out.println("finally����飺" + i * i);
        }
        return 0;

    }


}
