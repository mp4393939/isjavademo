package string;

public class UseTrim {
    public static void main(String args[]) {
        String str1 = "This is String not null";
        String str2 = "        This is String not null    ";
        System.out.println(str1);
        System.out.println(str2.trim());
        System.out.print("比较原始的字符串str1和截取后的字符串str2是否相等：");
        System.out.print(str1 == str2.trim());//false
        //trim()方法实际上是截取中间的非空白字符
        String str3 = "        This is String              not null    ";
        System.out.println("\n" + str3.trim());
    }
}