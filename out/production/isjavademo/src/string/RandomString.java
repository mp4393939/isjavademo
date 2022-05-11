package string;

import java.util.Random;

public class RandomString {
    public static void main(String[] args) {
        RandomString rs = new RandomString();
        System.out.println("随机生成字母数字:" + rs.getRandomString(15));
        System.out.println("随机生成字母:" + rs.getRandomString1(20));
        String greeting = "rrr";
        System.out.println("转换大写方法一:" + greeting.toUpperCase());
        System.out.println("转换大写方法二:" + greeting.toString().toUpperCase());

        //System.out.println(Character.toUpperCase('A'));
    }

    //随机生成一段指定长度的字符串
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

    //随机生成一段指定长度的数值
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
