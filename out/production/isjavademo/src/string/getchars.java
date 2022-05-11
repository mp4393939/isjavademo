package string;

class charat {
    //提取单个字符
    char ch = "abc".charAt(1);
}

public class getchars {
    public static void main(String args[]) {
        String s = "This is a demo of the getChars method";
        int start = 10, end = 14;
        char ch[] = new char[end - start];
        s.getChars(start, end, ch, 0);
        //提取多个字符
        System.out.println(ch);
        charat c = new charat();
        System.out.println(c.ch);
        System.out.println(s);
        //使用toCharArray()方法返回整个字符串
        System.out.println(s.toCharArray());
    }
}
