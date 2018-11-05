package stringbuff;

public class setCharAt_setLength {
    public static void main(String[] args) {
        StringBuffer s=new StringBuffer("Hello");
        System.out.println("buffer before="+s);
        System.out.println("charAt(1) before="+s.charAt(1));
        s.setCharAt(1,'i');
        s.setLength(2);
        System.out.println("buffer after="+s);
        System.out.println("charAt(1) after="+s.charAt(1));
       byte a=10;
        s.append(a);
        System.out.println(s);
        //append()将各种其他类型的字符串表示形式连接到调用StringBuffer对象的末尾
        int a1=42;
        StringBuffer s1=new StringBuffer(40);
        s1.append("a=").append(a1).append("!").toString();
        System.out.println(s1);
    }
}
