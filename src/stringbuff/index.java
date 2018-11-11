package stringbuff;

public class index {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("one two one two");
        //查找str在调用StringBuffer对象中第一次出现时的位置索引
        System.out.println("First index:" + s.indexOf("one"));
        //查找str在调用StringBuffer对象中最后一次出现时的位置索引
        System.out.println("First index:" + s.lastIndexOf("one"));
    }
}
