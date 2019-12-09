package string;

public class capacity {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("Hello");
        System.out.println("buffer=" + s);
        System.out.println("buffer.length=" + s.length());
        //capacity()表示已分配的容量
        System.out.println("buffer.capacity=" + s.capacity());

    }
}
