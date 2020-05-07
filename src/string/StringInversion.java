package string;

//总结一道 Java 面试常见编程题：将 'abc123' 字符串反转，把你能想到的方法都写下来
public class StringInversion {
    public static void main(String[] args) {
        String s = "abc123";
        System.out.println("变换前: " + s);
        System.out.print("（遍历charAt(i)）变换后: ");
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
        System.out.print("\n");
        System.out.println("利用StringBuffer或StringBuilder的reverse成员方法变换后: " + reverse1(s));
        System.out.println("利用String的toCharArray方法先将字符串转化为char类型数组，然后将各个字符进行重新拼接变换后: " + reverse2(s));
        System.out.println("利用String的CharAt方法取出字符串中的各个字符变换后: " + reverse3(s));
    }

    //利用StringBuffer或StringBuilder的reverse成员方法
    public static String reverse1(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    //利用String的toCharArray方法先将字符串转化为char类型数组，然后将各个字符进行重新拼接
    public static String reverse2(String str) {
        char[] chars = str.toCharArray();
        String reverse = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            reverse += chars[i];
        }
        return reverse;
    }

    //利用String的CharAt方法取出字符串中的各个字符
    public static String reverse3(String str) {
        String reverse = "";
        int length = str.length();
        for (int i = 0; i < length; i++) {
            reverse = str.charAt(i) + reverse;
        }
        return reverse;
    }
}
