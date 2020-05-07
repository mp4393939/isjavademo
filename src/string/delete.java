package string;

public class delete {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("This is a HashtableDemo1");
        //delete()从调用对象删除一连串字符
        s.delete(4, 7);
        System.out.println(s);
        //deleteCharAt()删除指定索引位置的字符
        s.deleteCharAt(0);
        System.out.println(s);
    }
}
