package string;

import java.util.Random;

public class RandomString {
    public static void main(String[] args) {
        RandomString rs = new RandomString();
        System.out.println("���������ĸ����:" + rs.getRandomString(15));
        System.out.println("���������ĸ:" + rs.getRandomString1(20));
        String greeting = "rrr";
        System.out.println("ת����д����һ:" + greeting.toUpperCase());
        System.out.println("ת����д������:" + greeting.toString().toUpperCase());

        //System.out.println(Character.toUpperCase('A'));
    }

    //�������һ��ָ�����ȵ��ַ���
    public String getRandomString(int length) {
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(62);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }

    //�������һ��ָ�����ȵ���ֵ
    public String getRandomString1(int length) {
        Random random1 = new Random();
        StringBuffer sb1 = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number1 = random1.nextInt(length);
            sb1.append(Integer.valueOf(number1));
        }
        return sb1.toString().substring(0, length);

    }
}
