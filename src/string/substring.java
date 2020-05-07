package string;

//substring()在一个字符串中使用一个子串替换另一个子串的实例
public class substring {
    public static void main(String[] args) {
        String str = "This is a HashtableDemo1.This is,too.";
        String search = "is";
        String sub = "was";
        String result;
        int i;
        do {
            System.out.println(str);
            //查找子串第一次出现的索引
            i = str.indexOf(search);
            if (i != -1) {
                //substring()方法会逐步字符串中的把“is”替换为“was”
                result = str.substring(0, i);
                result = result + sub;
                result = result + str.substring(i + search.length());
                str = result;
            }
        } while (i != -1);
    }
}
