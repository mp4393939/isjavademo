package string;

public class squals {
    public static void main(String args[]) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "HELLO";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s3));
        //equals是比较对象中的字符，"=="是比较对两个对象的引用
        System.out.println("s1==s2" + s1 == s2);

    }
}
