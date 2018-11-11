package String;

public class substring {
    public static void main(String[] args) {
        String str = "This is a test.This is,too.";
        String search = "is";
        String sub = "was";
        String result;
        int i;
        do {
            System.out.println(str);
            //查找子串第一次出现的索引
            i = str.indexOf(search);
            if (i != -1) {
                //substring()在一个字符创众使用一个子串替换另一个子串的实例
                result = str.substring(0, i);
                result = result + sub;
                result = result + str.substring(i + search.length());
                str = result;
            }
        } while (i != -1);
    }
}
