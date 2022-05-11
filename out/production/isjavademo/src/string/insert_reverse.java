package string;

public class insert_reverse {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("I Java");
        //insert()将一个字符串插入到另一个字符串中
        s.insert(2, "like");
        System.out.println(s);
        //reverse()颠倒StringBuffer对象中的字符
        s.reverse();
        System.out.println(s);
    }
}
